package com.coding.day03.循环;

public class Demo3_0 {

    public static void main(String[] args) {
        for (int i = 1; i <= 16 ; i *= 2) {
            System.out.print("1/" + i + (i != 16 ? "，" : ""));
        }
    }
}
