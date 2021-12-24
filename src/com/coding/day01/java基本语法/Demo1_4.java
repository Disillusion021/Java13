package com.coding.day01.java基本语法;

public class Demo1_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int u = 1; u <= i; u++) {
                System.out.print(i + " * " + u + " = " + (i * u));
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
