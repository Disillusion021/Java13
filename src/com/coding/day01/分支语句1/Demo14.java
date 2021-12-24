package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：");
        int x = sc.nextInt();
        if (x % 5 ==0) {
            System.out.println("该数字能被5整除");
        } else {
            System.out.println("该数字不能被5整除");
        }
    }
}
