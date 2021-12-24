package com.coding.设计模式.单例设计模式;

//  java.lang.Runtime就是经典的饿汉式单例设计模式
/*
    饿汉式单例设计模式
    1. 私有化构造器
    2. 在类的内部创建一个静态实例
    3. 提供一个静态方法返回这个静态实例
 */
/*
    为什么是该静态对象是单例？
    因为构造器被私有化，所以该类只能在本类中new对象。
    而本类中只在类中new了一个对象，所以自始至终都只有本类中new出的这一个对象,此即为单例
    之所以把该对象的引用定义为static是因为想要通过类名.静态方法.静态变量的方式为该对象提供一个外部可以访问的出口
 */
/*
    为什么被称作饿汉式？
    因为类一加载，实例就被创建出来了，即使它还未被使用。
 */
public class GirlFriendStarve {
    private String name;

    //私有化构造方法，此时不能非本类不可以new对象，也即不能对象.访问，只可以类名.访问成员
    private GirlFriendStarve(String name) {
        this.name = name;
    }
    //在类中构建一个静态对象.
    private static GirlFriendStarve gf = new GirlFriendStarve("小妈");
    //构建static方法即可以通过类访问得到静态对象
    public static GirlFriendStarve creatGirl(String name) {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
