package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sc.nextDouble();
        if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("中等");
        } else {
            System.out.println("差");
        }
    }
}
