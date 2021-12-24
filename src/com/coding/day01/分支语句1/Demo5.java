package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入性别");
        System.out.println("提示：1代表男，1以外代表女");
        double a = sc.nextDouble();
        if (a==1) {
            System.out.println("您输入的性别为男");
        } else {
            System.out.println("您输入的性别为女");
        }
    }
}
