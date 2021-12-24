package com.coding.day08.封装;

import java.util.Scanner;

public class TestEchelon {

    public static void main(String[] args) {
        Echelon a = new Echelon();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入梯形顶长：");
        double bottom = sc.nextDouble();
        System.out.println("请输入梯形底长：");
        double top = sc.nextDouble();
        System.out.println("请输入梯形的高：");
        double height = sc.nextDouble();
        a.setBottom(bottom);
        a.setTop(top);
        a.setHeight(height);
        System.out.println(a.getArea());
    }
}
