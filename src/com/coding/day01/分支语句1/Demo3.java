package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：");
        int x = sc.nextInt();
        if (x < 100 && x >= 10) {
            System.out.println("该数字是两位数");
        } else {
            System.out.println("该数字不是两位数");
        }
    }
}
