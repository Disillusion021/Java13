package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();
        if (x < 10 || x >= 100) {
            System.out.println("输入错误");
        } else if (x % 2 ==0) {
            System.out.println("该数字为偶数");
        } else {
            System.out.println("该数字为奇数");
        }
    }
}
