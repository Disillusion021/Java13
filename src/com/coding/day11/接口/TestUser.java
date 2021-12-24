package com.coding.day11.接口;

import java.util.Scanner;

public class TestUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddUser addUser = new AddUserImpl();
        SelectUser selectUser = new SelectUserImpl();
        while (true) {
            System.out.println("1. 普通用户 2. 会员用户");
            int type = sc.nextInt();
            if (type == 1) {
                Customer customer = new Customer();
                System.out.println("请添加账号：");
                int no = sc.nextInt();
                System.out.println("请添加密码：");
                int password = sc.nextInt();
                System.out.println("请添加积分：");
                int score = sc.nextInt();
                addUser.addCustomer(customer, no, password, score);
                selectUser.selectCustomer(customer);
                break;
            } else if (type == 2) {
                Vip vip = new Vip();
                System.out.println("请添加账号：");
                int no = sc.nextInt();
                System.out.println("请添加密码：");
                int password = sc.nextInt();
                System.out.println("请添加积分：");
                int score = sc.nextInt();
                addUser.addVip(vip, no, password, score);
                selectUser.selectVip(vip);
                break;
            } else {
                System.out.println("请重新输入");
            }
        }



    }
}
