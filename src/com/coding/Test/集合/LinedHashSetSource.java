package com.coding.Test.集合;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinedHashSetSource {
    public static void main(String[] args) {
        // 分析一下LinkedHashSet的底层机制
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("刘", 1001));
        set.add(123);
        set.add("HSP");

        System.out.println("set=" + set);
        // 解读
        //1. LinkedHashSet 加入顺序和取出元素/数据的顺序一致
        //2. LinkedHashSet 底层维护的是一个LinkedHashMap(是HashMap的子类)
        //3. LinkedHashSet 底层结构（数组table + 双向链表）
        //4. 添加第一次时，直接将数组table扩容到16(HashMap$Node[16])，存放的结点运行类型为 LinkedHashMap$Entry
        //5. table数组是 HashMap$Node[] 存放的元素/数据是 LinkedHashMap$Entry 类型
    }
}

class Customer {
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }
}