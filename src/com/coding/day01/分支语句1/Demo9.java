package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入语文成绩：");
        double chinese = sc.nextDouble();
        System.out.print("请输入数学成绩：");
        double math = sc.nextDouble();
        if (chinese >= 100 && math >= 80) {
            System.out.println("进重点班");
        } else {
            System.out.println("进平行班");
        }
    }
}
