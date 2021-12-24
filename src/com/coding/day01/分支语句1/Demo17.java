package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) )   {
            System.out.println("该年份为闰年");
        } else {
            System.out.println("该年份不为闰年");
        }
    }
}
