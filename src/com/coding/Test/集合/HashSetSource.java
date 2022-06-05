package com.coding.Test.集合;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetSource {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        hashSet.add(new Employee("小王", 8000, new MyDate(1, 1, 1)));
        hashSet.add(new Employee("小王", 9000, new MyDate(1, 1, 1)));
        hashSet.add(new Employee("小李", 8000, new MyDate(1, 1, 1)));
        System.out.println("set=" + hashSet);
    }
    /*
        HashSet源码解读
        1. 执行 HashSet()
            public HashSet() {
                map = new HashMap<>();
            }
        2. 执行 add()
            public boolean add(E e) { // e: "Java"
                return map.put(e, PRESENT) == null; // PRESENT: 是一个 static final 常量 Object对象，用于占位，所有对象共享
                // 判断返回值是否为 null, null代表当前table中对应卡槽维护的链表中没有该元素，添加成功返回null，如果存在该元素，则会将该元素返回，不等于null返回false，添加失败
            }
        3. 执行 put()，该方法会执行 hash(key) 得到key对应的hash值
            算法 hash = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16)
            hash值 并不是 hashCode 而是 右移16位的hashCode与自己做异或运算 得到的
            public V put(K key V value) { // key: "Java" value: PRESENT 共享一个Object对象占位
                return putVal(hash(Key), key, value, false, true);
            }
        4. 执行 putVal()
            final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i; // 定义了辅助变量
                // table 是 HashMap 的 底层的 Node<K,V>[] 数组
                // if 语句表示如果当前 table 是 null，或者大小是 0
                // 就第一次扩容到 16个空间
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                // 根据 (n - 1) & hash 计算当前元素应该存放到 table 中的哪个卡槽中
                // key -> hashcode -> hash -> table中的卡槽索引
                // 数组的大小n有意设置为2^n,所以 n-1(1111) 后 再与 hash值 做与运算，确定存放在哪个卡槽中
                // (n-1) & hash 代表用hash除2^n取余, 余数即为索引位置
                // p 为 当前数组中要存放的卡槽里现有的数据, 检查该位置有没有元素
                if ((p = tab[i = (n - 1) & hash]) == null)
                    // 如果table数组当前卡槽没有元素，创建一个新的Node节点直接存进去
                    tab[i] = newNode(hash, key, value, null);
                else {
                    // 如果table数组当前卡槽有既有元素
                    Node<K,V> e; K k;
                    // 如果当前索引位置对应的链表的第一个元素和准备添加的key的hash值一样并且
                    // hash值相同的情况下并且要添加的元素的key就是当前索引位置第一个元素的key一样(先用hash值判断，再用==判断，再用equals判断)
                    // 首先用hash值做判断，但是hash值相同，对象仍可能不相等，所以接着用 == 判断是否是同一个对象，接着判断是否equals相等，只要equals相等就代表key相等了，就令e=当前元素
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                        // 先用hash值比较，是为了快速判断键是否有相等的可能性，快速排除key不同的情况，不用调equals方法一个个属性去比较，接着判断key是否真的相等，
                        这时候分两步，第一步，判断key是否是同一个对象==相等，也是为了不调equals方法，第二步判断key是否equals相等。
                        // if 列举如下
                        // 如果现有第一个元素p.key为null，p.hash=0，如果要添加的元素key为null，hash=0，那么第一个条件hash相等成立，第二个条件==成立
                        // 如果现有第一个元素p.key不为null,但p.hash=0，如果要添加的元素key为null，hash=0，那么第一个条件hash相等成立，第二个条件中==不成立，key为null的这种情况可能会走到equals中，所以声明了 key != null && key.equals(k) 防止null指针异常
                    else if (p instanceof TreeNode)
                        // 判断p是不是一颗红黑树
                        // 如果是一颗红黑树，就调用putTreeVal，来进行添加
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else {
                        // 既不和第一个元素key相等，又没有树化，就走链表的逻辑
                        // 循环判断是否有和当前key equals相等 的key
                        for (int binCount = 0; ; ++binCount) {
                            // 每次令 e = p.next，并在循环结束令 p = e，来进行迭代
                            if ((e = p.next) == null) {
                                // 判断 e 是否为 null ，如果 e = null 则代表 当前key唯一，可以添加
                                // p.next = newNode添加当前元素
                                p.next = newNode(hash, key, value, null);
                                // 注意：在把元素添加到链表后，立即判断链表长度是否超过8(不包含8)，超过8就调用treeifyBin() 对当前链表进行树化
                                // binCount = 7 时，正在添加第9个元素，添加第9个元素后进行树化操作
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            // 每次判断 e的key 是否和 当前 key equals相等，相等则退出循环，此时 e = 和当前key相等的元素
                            if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    // 如果 e != null 代表存在与当前key相等的元素
                    if (e != null) { // existing mapping for key
                        // 返回 与当前key相等的既有元素的value值
                        V oldValue = e.value;
                        // onlyIfAbsent为false则表示，hashmap允许覆盖
                        if (!onlyIfAbsent || oldValue == null)
                            // key相同，用当前value值覆盖，既有元素的value值
                            e.value = value;
                        // 空方法等着被实现
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                // 判断HashMap的size是否超过table数组的负载容量，(默认为table数组长度的75％)
                if (++size > threshold)
                    resize();
                // HashMap留给它的子类去实现执行一些动作的一个方法，比如LinkedHashMap
                afterNodeInsertion(evict);
                return null;
            }
     */
}

class Employee {
    private String name;
    private int sal;
    private MyDate birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate {
    int year;
    int month;
    int day;

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
