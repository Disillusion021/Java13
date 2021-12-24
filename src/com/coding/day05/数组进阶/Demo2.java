package com.coding.day05.数组进阶;

import java.util.Random;

public class Demo2 {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*100) + 1;
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + "  ");
            }
        }
    }
}
