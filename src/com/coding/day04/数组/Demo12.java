package com.coding.day04.数组;

import java.util.Scanner;

public class Demo12 {

    public static void main(String[] args) {
        int[] a = {5, 8, 1, 3, 9, 12, 21, 4, 7, 12};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        int confirm = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                confirm = 1;
            }
        }
        System.out.println(confirm == 1 ? "存在" : "不存在");
    }
}
