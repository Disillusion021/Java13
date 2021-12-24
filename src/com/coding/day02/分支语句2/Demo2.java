package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个成绩");
        double max = sc.nextDouble();
        System.out.println("请输入第二个成绩：");
        double b = sc.nextDouble();
        System.out.println("请输入第三个成绩：");
        double c = sc.nextDouble();
        System.out.println("请输入第四个成绩：");
        double d = sc.nextDouble();
        System.out.println("请输入第五个成绩：");
        double e = sc.nextDouble();
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }
        System.out.println("结果：最高分为" + max);
    }
}
