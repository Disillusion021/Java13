package com.coding.day01.java基本语法;

public class Demo1_3 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 7, 5, 3, 1};
        int x = 1;
        for (int i = 0; i < a.length; i++) {
            int n = a[i];
                for(int u = 0; u < n; u++){
                    System.out.print("*");
                }
            System.out.println();
        }

    }
}