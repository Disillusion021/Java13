package com.coding.day03.循环;

public class Demo17 {

    public static void main(String[] args) {
        int count = 0;
        for (double i = 0.08; i < 8848.13 * 1000 ; i *= 2) {
            count++;
        }
        System.out.println(count);
    }
}
