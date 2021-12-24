package com.coding.day04.数组;

public class Demo10 {

    public static void main(String[] args) {
        boolean[] a = {true, false, false, true};
        for (int i = 0; i < a.length; i++) {
            a[i] = !a[i];
            System.out.println(a[i]);
        }
    }
}

