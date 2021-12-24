package com.coding.day07.类和面向对象;

public class Demo4 {

    public static void main(String[] args) {
        Count c = new Count();
        c.assign(10);
        System.out.println(c.number);
        System.out.println(c.compare(6));
    }
}
