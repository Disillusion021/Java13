package com.coding.day16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("请输入第" + (i + 1) + "个整数：");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                arr[i] = a;
            } catch (InputMismatchException e) {
                System.out.println("输入类型错误，请重试");
                i--;
            }
        }
        int count = 0;
        double sum = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
                sum += i;
            }
        }
        if (count == 0) {
            System.out.println("数组中不存在非负数");
        } else {
            System.out.println("数组中所有非负数平均值为：" + sum / count);
        }
    }
}
