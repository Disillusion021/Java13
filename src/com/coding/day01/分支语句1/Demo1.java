package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***成绩奖励系统***");
        System.out.print("请输入成绩：");
        double grade = sc.nextDouble();
        if (grade >= 90) {
            System.out.println("结果：奖励1000元");
        }
        System.out.println("***系统结束***");
    }
}
