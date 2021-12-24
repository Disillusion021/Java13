package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入Java成绩：");
        double x = sc.nextDouble();
        System.out.println("请输入音乐成绩：");
        double y = sc.nextDouble();
        if (x > 98 && y > 80 || (x == 100 && y > 70) ) {
            System.out.println("老师奖励他");
        } else {
            System.out.println("无奖励");
        }
    }
}
