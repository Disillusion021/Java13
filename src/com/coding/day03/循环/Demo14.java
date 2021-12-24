package com.coding.day03.循环;

import java.util.Scanner;

public class Demo14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int sum = 0;
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("请输入第" + i + "个整数：");
            int a = sc.nextInt();
            if (a > 0) {
                sum1 += a;
            }
            if (a < 0) {
                sum2 += a;
            }
        }
        System.out.println("正数之和是：" + sum1);
        System.out.println("负数之和是：" + sum2);
    }
}
