package com.coding.day04.数组;

public class Demo6 {

    public static void main(String[] args) {
        int[] oldArr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int count = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
