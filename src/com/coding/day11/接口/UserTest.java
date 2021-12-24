package com.coding.day11.接口;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请添加账户：");
        int id = sc.nextInt();
        System.out.println("请添加密码：");
        int password = sc.nextInt();
        UserCheck userCheck = new UserCheckImpl();
        User user = userCheck.addUser(id, password);
        System.out.println("添加成功");
        System.out.println("请输入账户：");
        id = sc.nextInt();
        System.out.println("请输入密码：");
        password = sc.nextInt();
        if (userCheck.checkUser(user,id,password)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
