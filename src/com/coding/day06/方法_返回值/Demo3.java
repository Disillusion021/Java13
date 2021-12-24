package com.coding.day06.方法_返回值;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "个数：");
            arr[i] = sc.nextInt();
        }
        System.out.println("数组中所有数据和为：" + m.f3(arr));
    }
}
