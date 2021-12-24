package com.coding.day16;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            for (int j = 0; j <= 5; j++) {
                System.out.println(arr[j]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("超出索引");
        }
    }
}
