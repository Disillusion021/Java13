package com.coding.day02.分支语句4switch语句;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        switch (x%3) {
            case 0:
                System.out.println("该数字可以被3整除");
                break;
            case 1:
                System.out.println("该数字不可以被3整除，余数为1");
                break;
            default:
                System.out.println("该数字不可以被3整除，余数为2");
        }
    }
}
