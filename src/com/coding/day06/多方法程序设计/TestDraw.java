package com.coding.day06.多方法程序设计;

import java.util.Scanner;

class TestDraw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c = sc.nextInt();
        System.out.println(a + b > c && a + c > b && b + c > a ? "能构成三角形，" + "三角形的面积为：" + Draw.calculateArea(a, b, c):"不能构成三角形");
    }
}
