package com.coding.day03.循环;

public class Demo18 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i / 10 == 7 || i % 10 == 7 || i % 7 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
