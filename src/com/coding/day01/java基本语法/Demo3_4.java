package com.coding.day01.java基本语法;

import java.util.Scanner;

public class Demo3_4 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入学号：");
        String a = sc1.next();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入名字：");
        String b = sc2.next();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入成绩：");
        String c = sc3.next();
        System.out.println("学号" + a + "，名字，" + b + "，成绩" + c);
    }
}
