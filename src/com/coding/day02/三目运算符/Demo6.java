package com.coding.day02.三目运算符;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        double a = sc.nextDouble();
        System.out.println("请输入第一个数：");
        double b = sc.nextDouble();
        System.out.println("请输入第一个数：");
        double c = sc.nextDouble();
        System.out.println("最大值为" + (c>(a>b?a:b)?c:(a>b?a:b)));
    }
}
