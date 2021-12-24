package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数字");
        double b = sc.nextDouble();
        if (a < b) {
            System.out.println("最大值为：" + b);
        } else {
            System.out.println("最大值为：" + a);
        }

    }
}
