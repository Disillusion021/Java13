package com.coding.day04.数组;

import java.util.Scanner;

public class Demo12_1 {

    public static void main(String[] args) {
        int[] a = {5, 8, 1, 3, 9, 12, 21, 4, 7, 12};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println("存在");
                return;                         //如果存在则停止程序运行，省时间省无用操作。无需遍历判断
            }
        }
        System.out.println("不存在");
    }
}
