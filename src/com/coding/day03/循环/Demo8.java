package com.coding.day03.循环;

public class Demo8 {

    public static void main(String[] args) {
        int all = 0;
        for (int i = 1; i <= 100 ; i++) {
            all = all + (i % 2 == 0 ? -i : i);
        }
        System.out.println(all);
    }
}
