package com.coding.day03.循环程序结构设计;

import java.util.Scanner;
import java.util.Stack;

public class Demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (; ; ) {
            System.out.println("请输入用户名：");
            String acc = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            if (acc.equals("admin") && password.equals("stack")) {
                System.out.println("登录成功");
                break;
            } else {
                count++;
                if (count < 3) {
                    System.out.println("登录失败，请重新登录");
                } else {
                    System.out.println("连续3次登录失败，不允许再登录");
                    break;
                }
            }
        }
    }
}
