package com.coding.day08.封装;

import java.util.Scanner;

public class TestChinaBank {

    public static void main(String[] args) {
        ChinaBank acc = new ChinaBank();
        Scanner sc = new Scanner(System.in);
        //验证密码环节
        for (;;) {
            System.out.print("请输入密码：");
            int p = sc.nextInt();
            if (acc.check(p)) {
                System.out.println("正确！");
                break;
            } else {
                System.out.println("输入错误！");
            }
        }
        //进入操作选单
        for (;;) {
            System.out.println("请选择：1.存钱 2.取钱 3.显示余额 4.退出");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.print("请输入存钱金额：");
                int money = sc.nextInt();
                acc.saveMoney(money);
            } else if (choose == 2) {
                System.out.print("请输入取钱金额：");
                int money = sc.nextInt();
                acc.drawMoney(money);
            } else if (choose == 3) {
                System.out.println("当前余额为" + acc.getMoney() + "元");
            } else if (choose == 4) {
                System.out.println("退出成功！");
                break;
            } else {
                System.out.println("输入错误");
            }
        }

    }
}
