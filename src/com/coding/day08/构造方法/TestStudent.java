package com.coding.day08.构造方法;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        int no = sc.nextInt();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入姓名：");
        String name = sc.next();
        Student xiaoMing = new Student(no, age, name);
        xiaoMing.showStudent();
    }
}
