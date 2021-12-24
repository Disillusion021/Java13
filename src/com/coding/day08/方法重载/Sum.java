package com.coding.day08.方法重载;

public class Sum {

    public int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int getSum(String[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].length();
        }
        return sum;
    }

    public int getSum(boolean[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        String[] arr2 = {"a", "ab", "abc"};
        boolean[] arr3 = {true, false, true};
        Sum x = new Sum();
        System.out.println(x.getSum(1, 2, 3));
        System.out.println(x.getSum(arr1));
        System.out.println(x.getSum(arr2));
        System.out.println(x.getSum(arr3));
    }
}
