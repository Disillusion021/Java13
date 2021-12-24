package com.coding.day04.数组;

import java.util.Scanner;

public class Demo12_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "个数：");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if ( arr[i] == arr[j]) {
                    System.out.println("出现");
                    return;
                }
            }
        }
        System.out.println("没出现");
    }
}
