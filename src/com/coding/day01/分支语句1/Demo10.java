package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入体育成绩：");
        double a = sc.nextDouble();
        System.out.print("请输入美术成绩：");
        double b = sc.nextDouble();
        if (a + b > 180) {
            System.out.println("成绩和为：" + (a+b) + "老师奖励他");
        } else {
            System.out.println("无奖励");
        }
    }
}
