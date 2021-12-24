package com.coding.day04.逻辑编程1;

public class 斐波那契数列溢出 {

    // 1 1 1 3 5 9 17 31

    public static void main(String[] args) {
        double a = 1, b = 1, c = 3;
        for (int i = 3; i <= 20190314; i++) {
            c = a + b + c;
            b = c - a - b;
            a = c - b - a;
            System.out.println(a);
        }
        System.out.println(a % 10);
    }
}
