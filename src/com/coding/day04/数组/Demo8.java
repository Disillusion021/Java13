package com.coding.day04.数组;

public class Demo8 {

    public static void main(String[] args) {
        int[] scores = {-60, 59, -77, 53, 66, -12};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 0) {
                sum1 += scores[i];
            } else {
                sum2 += scores[i];
            }
        }
        System.out.println("正数和为：" + sum1);
        System.out.println("负数和为：" + sum2);
    }
}
