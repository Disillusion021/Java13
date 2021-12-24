package com.coding.day01.java基本语法;

import java.util.Scanner;

public class Demo4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个五位数：");
        int x = sc.nextInt();
        int a = (x) / 10000;
        int b = (x) / 1000 - 10 * a;
        int c = (x) / 100 - 100 * a - 10 * b;
        int d = (x) / 10 - a * 1000 - b * 100 - c * 10;
        int e = (x) % 10;
        System.out.println(a + "  " + b + "  " + c + "  " + d + "  " + e);
    }
}
