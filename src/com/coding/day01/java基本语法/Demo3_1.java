package com.coding.day01.java基本语法;

import java.util.Scanner;

public class Demo3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号： ");
        String account = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        System.out.println();
        System.out.println("您的账号为" + account + ", 密码为" + password);
    }
}




