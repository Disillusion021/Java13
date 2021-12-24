package com.coding.day03.循环;

import java.util.Scanner;

public class Demo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第1个数字：");
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
