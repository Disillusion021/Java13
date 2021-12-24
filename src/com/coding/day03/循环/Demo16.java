package com.coding.day03.循环;

public class Demo16 {

    public static void main(String[] args) {
        double money = 10000;
        for (int i = 1; i <= 10 ; i++) {
            money = money * 1.03;
        }
        System.out.println(money);
    }
}
