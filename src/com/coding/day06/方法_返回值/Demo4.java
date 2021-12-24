package com.coding.day06.方法_返回值;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数：");
            arr[i] = sc.nextInt();
        }
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        if (m.f4(arr, num)) {
            System.out.println("该数字在数组中存在");
        } else {
            System.out.println("该数字在数组中不存在");
        }
    }
}
