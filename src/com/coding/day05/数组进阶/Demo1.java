package com.coding.day05.数组进阶;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数");
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
