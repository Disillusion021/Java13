package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(1);
        } else if (a == b) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
