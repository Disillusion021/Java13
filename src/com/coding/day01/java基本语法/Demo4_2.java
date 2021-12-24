package com.coding.day01.java基本语法;

import java.util.Scanner;

public class Demo4_2 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第二个数字：");
        int b = sc2.nextInt();
        System.out.println(a + "+" + b + "=" + (a + b));
        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int c = sc3.nextInt();
        Scanner sc4 = new Scanner(System.in);
        System.out.println("请输入第二个数字：");
        int d = sc4.nextInt();
        System.out.println(c + "-" + d + "=" + (c - d));
        Scanner sc5 = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int e = sc5.nextInt();
        Scanner sc6 = new Scanner(System.in);
        System.out.println("请输入第二个数字：");
        int f = sc6.nextInt();
        System.out.println(e + "*" + f + "=" + (e * f));
        Scanner sc7 = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int g = sc7.nextInt();
        Scanner sc8 = new Scanner(System.in);
        System.out.println("请输入第二个数字：");
        int h = sc8.nextInt();
        System.out.println(g + "/" + h + "=" + (g / h));

    }
}
