package com.coding.day06.多方法程序设计;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.print("该数字是偶数，");
            System.out.println("2-" + n + "之间的偶数和为" + oddAdd(n));
        } else {
            System.out.print("该数字是奇数，");
            System.out.println("1-" + n +"之间的奇数和为" + evenAdd(n));
        }
    }

    public static int oddAdd(int n) {
        int sum = 0;
        for (int i = 2; i <= n ; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static int evenAdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i += 2) {
            sum += i;
        }
        return sum;
    }
}
