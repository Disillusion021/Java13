package com.coding.二分法;

import java.util.Arrays;

public class DivideTwo {
    public static void main(String[] args) {
        int[] arr = {1,3,3432,423,239,240,241,242,23,2,32};
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        int lower = 0;
        int higher = arr.length - 1;
        int mid;
        int x = 32;
        while(lower <= higher) {
            mid = (lower + higher) / 2;
            if (x < arr[mid]) {
                higher = mid -1;
            } else if (x > arr[mid]){
                lower = mid + 1;
            } else {
                System.out.println("\n" +arr[mid]);
                return;
            }
        }
        System.out.println("\n" + "-1");
    }
}
