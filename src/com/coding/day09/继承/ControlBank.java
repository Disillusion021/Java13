package com.coding.day09.继承;

import java.util.Scanner;

public class ControlBank {
    Scanner sc = new Scanner(System.in);
    //创建银行并返回
    String bankName;
    double factor;
    public Bank bankCreat() {
        System.out.println("请选择对应的银行：1. 建设银行   2. 工商银行   3. 中国银行");
        int choose = sc.nextInt();
        if (choose == 1) {
            bankName = "建设银行";
            factor = 0.01;
            return new CCBBank();
        } else if (choose == 2){
            bankName = "工商银行";
            factor = 0.005;
            return new ICBCBank();
        } else if (choose == 3){
            bankName = "中国银行";
            factor = 0.008;
            return new ChinaBank();
        } else {
            System.out.println("输入错误，请重试");
            return null;
        }
    }

    public void bankOperate(Bank bank) {
        while (true) {
            System.out.println("欢迎进入" + bankName + "银行，请选择相关业务：1. 开户   2. 修改密码   3. 登陆   4. 退出系统");
            int choose1 = sc.nextInt();
            if (choose1 == 1) {
                System.out.println("请输入开户账号：");
                String userName = sc.next();
                System.out.println("请输入开户密码：");
                String password = sc.next();
                System.out.println("请再次输入开户密码：");
                String confirmPassword = sc.next();
                System.out.println(bank.createAccount(userName, password, confirmPassword) ? "开户成功" : "开户失败，请重新选择相关业务");
            }
            if (choose1 == 2) {
                System.out.println("请输入账号：");
                String userName = sc.next();
                System.out.println("请输入原密码：");
                String password = sc.next();
                System.out.println("请输入修改后的密码：");
                String newPassword = sc.next();
                System.out.println(bank.updatePassword(userName, password, newPassword) ? "修改成功" : "修改失败，请重新选择相关业务");
            }
            if (choose1 == 3) {
                while (true) {
                    System.out.println("请输入账号：");
                    String userName = sc.next();
                    System.out.println("请输入密码：");
                    String password = sc.next();
                    if (bank.login(userName, password)) {
                        System.out.println("登陆成功");
                        while (true) {
                            System.out.println("欢迎进入存取款业务，请选择：1. 存钱   2. 取钱   3. 显示余额   4. 退出系统");
                            int choose2 = sc.nextInt();
                            if (choose2 == 1) {
                                System.out.println("请输入存钱数额：");
                                double money = sc.nextInt();
                                System.out.println(bank.saveMoney(money) ? "存款成功" : "数额有误，请重新选择");
                            } else if (choose2 == 2) {
                                System.out.println("请输入取钱数额：");
                                double money = sc.nextInt();
                                System.out.println(bank.getMoney(money) ? "取钱成功，扣除手续费" + factor * money + "元" : "取钱失败");
                            } else if (choose2 == 3) {
                                bank.showMoney();
                            } else if (choose2 == 4) {
                                System.out.println("退出成功，感谢您的使用");
                                return;
                            } else {
                                System.out.println("输入错误，请重试");
                            }
                        }
                    } else {
                        System.out.println("登录失败，请重试");
                    }
                }
            }
            if (choose1 == 4) {
                System.out.println("退出成功，感谢您的使用");
                return;
            }
            if (choose1 < 1 || choose1 > 4) {
                System.out.println("输入错误，请重试");
            }
        }
    }
}
