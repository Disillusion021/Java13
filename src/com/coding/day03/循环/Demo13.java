package com.coding.day03.循环;

import java.util.Scanner;

public class Demo13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个数：");
        int a = sc.nextInt();
        System.out.println("请输入第2个数：");
        int b = sc.nextInt();
        int product = 1;
        for (int i = a; i <= b ; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
