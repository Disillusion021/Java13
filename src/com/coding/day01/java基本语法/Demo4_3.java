package com.coding.day01.java基本语法;

import java.util.Scanner;

public class Demo4_3 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入员工编号");
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入基本工资");
        double salary1 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入奖金");
        double bouns1 = sc3.nextInt();
        System.out.println("编号为" + num1 + "的员工工资总额为：" + (salary1 + bouns1));
        Scanner sc4 = new Scanner(System.in);
        System.out.println("请输入员工编号");
        int num2 = sc4.nextInt();
        Scanner sc5 = new Scanner(System.in);
        System.out.println("请输入基本工资");
        double salary2 = sc5.nextInt();
        Scanner sc6 = new Scanner(System.in);
        System.out.println("请输入奖金");
        double bouns2 = sc6.nextInt();
        System.out.println("编号为" + num2 + "的员工工资总额为：" + (salary2 + bouns2));
        Scanner sc7 = new Scanner(System.in);
        System.out.println("请输入员工编号");
        int num3 = sc7.nextInt();
        Scanner sc8 = new Scanner(System.in);
        System.out.println("请输入基本工资");
        double salary3 = sc8.nextInt();
        Scanner sc9 = new Scanner(System.in);
        System.out.println("请输入奖金");
        double bouns3 = sc9.nextInt();
        System.out.println("编号为" + num3 + "的员工工资总额为：" + (salary3 + bouns3));
        System.out.println("所有员工的工资总和为：" + (salary1 + bouns1 + salary2 + bouns2 + salary3 + bouns3));
    }
}
