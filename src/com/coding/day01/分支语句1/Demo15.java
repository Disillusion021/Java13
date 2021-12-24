package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int x = sc.nextInt();
        if (x % 3 == 0 && x % 7 == 0) {
            System.out.println("该数字可以同时被3和7整除");
        } else {
            System.out.println("该数字不能被3和7同时整除");
        }
    }
}
