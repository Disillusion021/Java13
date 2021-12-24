package com.coding.设计模式.单例设计模式;

/*
    1. 饿汉式是在类加载时创建对象，浪费资源，懒汉式是在要使用时调用方法时创建对象,节约资源
    2. 饿汉式不存在线程安全问题，懒汉式存在线程安全问题
 */
public class GirlFriendLazy {

    private String name;

    //声明一个静态引用
    private static GirlFriendLazy girl;

    //私有化构造方法，此时不能非本类不可以new对象，也即不能对象.访问，只可以类名.访问成员
    private GirlFriendLazy() {
    }

    //在静态方法中给静态引用创建对象赋值,通过此方法获取到单例对象
    //并且类加载时，不会创建对象，只有调用此方法时才会创建对象，因此叫做懒汉式单例设计模式
    public static GirlFriendLazy getLazyGirl() {
        if (girl == null) {
            girl = new GirlFriendLazy();
        }
        return girl;
    }
}