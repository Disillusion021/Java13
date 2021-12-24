package com.coding.day11.抽象类;

public class Test33 {
    public static void main(String[] args) {
        AbstractTest test11 = new Test11();
        AbstractTest test22 = new Test22();
        System.out.println(test11.f1(1, 2));
        System.out.println(test11.f2("小王", 23));
        System.out.println(test22.f1(1, 2));
        System.out.println(test22.f2("小王", 23));
    }
}
