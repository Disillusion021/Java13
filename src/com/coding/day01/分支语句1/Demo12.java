package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("该数字是以" + x % 10 +"结尾，偶数");
        } else {
            System.out.println("该数字是以" + x % 10 + "结尾，奇数");
        }
    }
}
