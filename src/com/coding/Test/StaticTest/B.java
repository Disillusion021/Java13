package com.coding.Test.StaticTest;

public class B extends A {
    public static int a = 20;
    public static void main(String[] args) {
        A b = new B();
        A a = new A();
        System.out.println(b.a++);
        System.out.println(++A.a);
        System.out.println(++B.a);
        System.out.println(a.a);
    }
}
