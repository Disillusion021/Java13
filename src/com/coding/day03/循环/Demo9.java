package com.coding.day03.循环;

public class Demo9 {

    public static void main(String[] args) {
        for (int i = 100; i < 999 ; i++) {
            if (i % (i / 100 + i % 100 / 10 + i % 10) == 0) {
                System.out.println(i);
            }
        }
    }
}
