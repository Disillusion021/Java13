package com.coding.day12.常用类;

public class Demo17 {

    public static void main(String[] args) {
        String s = "hello world";
        s = s.substring(s.length() - 2, s.length()) + s.substring(0, s.length() - 2);
        System.out.println(s);
    }
}
