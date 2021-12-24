package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double x = sc.nextDouble();
        if (x <= 10 ) {
            System.out.println("进入决赛");
        } else {
            System.out.println("恭喜，你被淘汰了");
        }
    }

}

