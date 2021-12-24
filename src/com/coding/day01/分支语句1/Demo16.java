package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个商品的价格：");
        double a = sc.nextDouble();
        System.out.println("请输入第2个商品的价格：");
        double b = sc.nextDouble();
        System.out.println("请输入第3个商品的价格：");
        double c = sc.nextDouble();
        if (a < 50 && b < 50 && c < 50 && a + b + c < 100) {
            System.out.println("不打折");
        } else {
            System.out.println("总价格" + (a + b + c) + "，折扣价" + (a + b + c) * 0.15 + "，折扣后应付：" + (a + b + c) * 0.85);
        }


    }
}
