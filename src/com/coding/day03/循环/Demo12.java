package com.coding.day03.循环;

import java.util.Scanner;

public class Demo12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= a ; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
