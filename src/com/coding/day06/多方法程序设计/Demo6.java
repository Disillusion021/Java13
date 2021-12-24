package com.coding.day06.多方法程序设计;

import java.util.Scanner;

public class Demo6 {

    public static int getMaxCount(int[] arr) {
        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count[i]++;
                }
            }
        }
        int max = count[0];
        int number = arr[0];
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                number = arr[i];
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数值：");
            arr[i] = sc.nextInt();
        }
        System.out.println("出现次数最高的数字为：" + getMaxCount(arr));
    }
}
