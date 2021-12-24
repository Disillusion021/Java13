package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int x = sc.nextInt();
        if (x >= 100 && x <1000) {
            System.out.println("该数字个位是" + x % 10 + "，十位是" + (x / 10 - x / 100 * 10) + "，百位是" + x / 100);
        } else {
            System.out.println("输入错误");
        }
    }
}
