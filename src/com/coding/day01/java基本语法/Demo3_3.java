package com.coding.day01.java基本语法;

import java.util.Scanner;

public class Demo3_3 {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        Scanner sc2 = new Scanner(System.in);
        a = sc1.nextInt();
        System.out.println("请输入第二个数：");
        b = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入第三个数：");
        c = sc3.nextInt();
        System.out.println("3个数的和为：" + (a + b + c));
    }
}
