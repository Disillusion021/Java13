package com.coding.day02.分支语句2;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();
        if (x > 999 || x < 0) {
            System.out.println("输入非法");
        } else if (x >99) {
            System.out.println("该数字是3位数");
        } else if (x >9) {
            System.out.println("该数字是2位数");
        } else {
            System.out.println("该数字是1位数");
        }
    }
}
