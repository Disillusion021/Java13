package com.coding.day04.逻辑编程1;

import java.util.Scanner;

public class Demo2_0 {

    public static void main(String[] args) {
        boolean[] witch = new boolean[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要瞎几把按开关多少轮：");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 100; j++) {
                if (j % i == 0) {
                            witch[j-1] = (!witch[j-1]);
                }
            }
        }
        for (int i = 0; i <=99 ; i++) {
            if (witch[i]) {
                System.out.print( i+1 + "  ");
            }
        }
    }
}
