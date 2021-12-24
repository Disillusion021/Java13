package com.coding.day04.数组;

public class Demo2 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
