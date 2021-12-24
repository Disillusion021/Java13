package com.coding.day01.java基本语法;

import java.util.Scanner;

public class Demo3_2 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第二个数");
        int b = sc2.nextInt();
        System.out.println("2个数的和为：" + (a + b));
    }
}
