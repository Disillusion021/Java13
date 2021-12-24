package com.coding.Test.包装类;

public class TestInteger {
    public static void main(String[] args) {
        //因为创建了两个对象
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

        //因为自动装箱的底层是valueOf方法，-128到127会存在一个缓存机制，不会new对象
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        Integer x = 128;
        Integer y = 128;
        int c = x;
        System.out.println(x == y);
    }
}
