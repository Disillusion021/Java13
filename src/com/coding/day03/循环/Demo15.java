package com.coding.day03.循环;

public class Demo15 {

    public static void main(String[] args) {
        //兔子为x只
        int x = 0;
        for (int i = 0; 4 * i + 2 * (35 - i) != 94 ; i++) {
            x = i + 1;
        }
        System.out.println("鸡、兔各" + (35 - x) + "、" + x + "只");
    }
}
