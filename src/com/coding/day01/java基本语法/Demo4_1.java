package com.coding.day01.java基本语法;

import java.util.Scanner;

public class Demo4_1 {

    public static void main(String[] args) {
        String name;
        int age;
        double Grade;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入姓名");
        name = sc1.next();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入年龄");
        age = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入成绩");
        Grade = sc3.nextDouble();
        System.out.println("该学生姓名为" + name + "，年龄为" + age + "，成绩为" + Grade + "分");
    }
}
