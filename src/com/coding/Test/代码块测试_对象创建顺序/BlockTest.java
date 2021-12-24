package com.coding.Test.代码块测试_对象创建顺序;

public class BlockTest {
    public static void main(String[] args) {
        new B();
    }
}
class A {
    static int aa = getAa();

    static {
        System.out.println("父类静态代码块执行");
    }

    int a = getA();

    {
        System.out.println("父类普通代码块执行");
    }

    public A() {
        System.out.println("父类构造器执行");
    }

    public static int getAa() {
        System.out.println("父类静态属性初始化");
        return aa;
    }

    public int getA() {
        System.out.println("父类普通属性初始化");
        return a;
    }
}

class B extends A {
    static {
        System.out.println("子类静态代码块执行");
    }

    static int bb = getBb();

    {
        System.out.println("子类普通代码块执行");
    }

    int b = getB();

    public B() {
        System.out.println("子类构造器执行");
    }

    public static int getBb() {
        System.out.println("子类静态属性初始化");
        return aa;
    }

    public int getB() {
        System.out.println("子类普通属性初始化");
        return b;
    }
}
