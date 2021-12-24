package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个数：");
        double a = sc.nextDouble();
        System.out.println("请输入第2个数：");
        double b = sc.nextDouble();
        System.out.println("请输入第3个数");
        double c = sc.nextDouble();
        double max = a;
        double min = a;
        double mid = a;
        if (a > b && a> c){
            max = a;
            if (b > c){
                mid = b;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        }
        if (b > a && b> c){
            max = b;
            if (a > c){
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }
        }
        if (c > a && c> b){
            max = c;
            if (a > b){
                mid = a;
                min = b;
            } else {
                mid = b;
                min = a;
            }
        }
        System.out.println("由大到小的顺序为：" + max + ", " + mid + ", " + min);
    }
}
