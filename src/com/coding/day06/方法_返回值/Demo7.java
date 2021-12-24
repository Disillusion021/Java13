package com.coding.day06.方法_返回值;

import java.util.Scanner;

public class Demo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入日期：");
        int day = sc.nextInt();
        System.out.println(m.f7(year, month, day) ? "日期正确" : "日期不正确");
    }
}
