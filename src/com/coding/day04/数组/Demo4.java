package com.coding.day04.数组;

import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        String result = "";
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第" + (i+1) + "个整数");
            a[i] = sc.nextInt();
            if (i == a.length - 1) {
                result = result + a[i] ;
            } else {
                result = result + a[i] + "，";
            }
        }
        System.out.println(result);
    }
}
