package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个数：");
        double a = sc.nextDouble();
        System.out.println("请输入第2个数：");
        double b = sc.nextDouble();
        System.out.println("请输入第3个数");
        double c = sc.nextDouble();
        double max = a;
        double min = a;
        if (b > max) {
            max = b;
        }
        if (b < min) {
            min = b;
        }
        if (c > max) {
            max = c;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("最大值：" + max + "，最小值：" + min + "，3个数的总和为" + (a + b + c));

    }
}
