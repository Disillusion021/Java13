package com.coding.day04.数组;

import java.util.Scanner;

public class Demo3_0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[6];
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第" + (i+1) + "个分数");
            a[i] = sc.nextDouble();
        }
        double sum = 0;
        double max = a[0];
        double min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
            sum = sum + a[i];
        }
        System.out.println("选手最终成绩为：" + (sum -  max - min) / 4);
    }
}
