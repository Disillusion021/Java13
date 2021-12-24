package com.coding.day02.分支结构程序设计;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c = sc.nextInt();
        System.out.println(a + b > c && a + c > b && b + c > a ? "能构成三角形，" + "三角形的面积为：" +  Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a ) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c)) + (a==b&&b==c?"，为等边三角形":a==b||b==c||a==c?"，为等腰三角形":"，为普通三角形") : "不能构成三角形");
    }
}
