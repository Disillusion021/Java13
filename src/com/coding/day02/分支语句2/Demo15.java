package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个五位数:");
        int a = sc.nextInt();
        if (a / 10000 == a % 10 && (a / 1000 - a / 10000 * 10 == (a % 100 - a % 10) / 10)) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}
