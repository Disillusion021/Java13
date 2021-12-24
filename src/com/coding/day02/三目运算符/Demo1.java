package com.coding.day02.三目运算符;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sc.nextDouble();
        System.out.println("结果：" + ( score >= 60 ? "及格" : "不及格" ) );
    }
}
