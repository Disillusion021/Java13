package com.coding.day08.封装;

import java.util.Scanner;

public class TestMathCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        MathCount a = new MathCount();
        a.setCount(num);
        System.out.println(a.getCount());
    }
}
