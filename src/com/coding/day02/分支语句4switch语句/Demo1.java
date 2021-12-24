package com.coding.day02.分支语句4switch语句;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("今天星期一，吃盖饭");
                break;
            case 2:
                System.out.println("今天星期二，吃饺子");
                break;
            case 3:
                System.out.println("今天星期三，吃麻辣烫");
                break;
            case 4:
                System.out.println("今天星期四，吃炒面");
                break;
            case 5:
                System.out.println("今天星期五，吃火锅");
                break;
            default:
                System.out.println("今天不吃饭");
                break;
        }

    }
}
