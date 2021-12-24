package com.coding.day01.java基本语法;

import java.util.Scanner;

public class Demo3_5 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第一个布尔值：");
        boolean a = sc1.nextBoolean();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第二个布尔值：");
        boolean b = sc2.nextBoolean();
        System.out.println("第一个布尔值为" + a + "，第二个布尔值为" + b);
    }
}
