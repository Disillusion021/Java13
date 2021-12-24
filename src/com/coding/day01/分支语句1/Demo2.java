package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入成绩：");
        double grade = sc.nextDouble();
        if (grade >= 60) {
            System.out.println("结果：及格");
        } else {
            System.out.println("结果：不及格");
        }
    }
}
