package com.coding.day03.循环;

public class Demo8_0 {

    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 20 ; i++) {
            sum += 1 / Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
