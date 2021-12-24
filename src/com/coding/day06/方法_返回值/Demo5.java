package com.coding.day06.方法_返回值;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String userName = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        System.out.println(m.f5(userName, password) ? "登录成功" : "登录失败");
    }
}
