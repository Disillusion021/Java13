package com.coding.day04.数组;

public class Demo7 {

    public static void main(String[] args) {
        int[] scores = {60, 59, 77, 53, 66, 12};
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                count++;
            }
        }
        System.out.println(count);
    }
}
