package com.coding.day01.java基本语法;

import java.util.Scanner;

public class Demo4_4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入长方形的长");
        double a = sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入长方形的宽");
        double b = sc2.nextDouble();
        System.out.println("长方形的周长为：" + (a+b)*2);
        System.out.println("长方形的面积为：" + (a*b));

        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入正方形的边长");
        double c = sc3.nextDouble();
        System.out.println("正方形的周长为：" + (2 * c)*2);
        System.out.println("正方形的面积为：" + (c * c) );

        Scanner sc4 = new Scanner(System.in);
        System.out.println("请输入圆的半径");
        double d = sc4.nextDouble();
        System.out.println("圆的周长为：" + (2* Math.PI * d));
        System.out.println("圆的面积为：" + (d* Math.PI * d));

        Scanner sc5 = new Scanner(System.in);
        System.out.println("请输入三角形的第一条边长");
        double e = sc5.nextDouble();
        System.out.println("请输入三角形的第二条边长");
        double f = sc5.nextDouble();
        System.out.println("请输入三角形的第二条边长");
        double g = sc5.nextDouble();
        System.out.println("三角形的周长为：" + (e+f+g));
        System.out.println("三角形的面积为：" +  Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a ) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c)));


    }
}
