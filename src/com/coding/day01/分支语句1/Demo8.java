package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入账号：");
        String account = sc.next();
        System.out.print("请输入密码：");
        int password = sc.nextInt();
        System.out.print("请再次输入密码确认：");
        int pw2 = sc.nextInt();
        if (password == pw2) {
            System.out.println("注册成功。您的账号为：" + account + "，密码为" + password);
        } else {
            System.out.println("注册失败，密码不一致");
        }
    }
}
