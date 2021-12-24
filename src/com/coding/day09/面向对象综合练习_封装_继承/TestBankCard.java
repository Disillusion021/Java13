package com.coding.day09.面向对象综合练习_封装_继承;

import java.util.Scanner;

public class TestBankCard {
    public static void main(String[] args) {
        System.out.println("显示菜单：");
        System.out.println("************");
        System.out.println("1、借记卡");
        System.out.println("2、信用卡");
        System.out.println("************");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choose = sc.nextInt();
            if (choose == 1) {
                DebitCard card = new DebitCard("招商银行", "2030/12/31");
                System.out.println("您已申请一张" + card.getCompany() + "银行的借记卡，卡号是" + card.getCardID() + "，卡片有效期到" + card.getValidateDate() + "，卡内余额为" + card.getMoney() + "元");
                while (true) {
                    System.out.println("请选择： 1. 充值  2. 刷卡");
                    int choose1 = sc.nextInt();
                    if (choose1 == 1) {
                        System.out.println("请输入充值金额：");
                        int cash = sc.nextInt();
                        if (card.deposit(cash)) {
                            System.out.println("充值成功");
                        } else {
                            System.out.println("充值失败");
                        }
                    } else if (choose1 == 2) {
                        System.out.println("请输入刷卡金额：");
                        double pay = sc.nextDouble();
                        if (card.consume(pay)) {
                            System.out.println("刷卡成功");
                        } else {
                            System.out.println("刷卡失败");
                        }
                    } else {
                        System.out.println("输入错误");
                    }
                    System.out.println("是否继续？ 【y】--继续  【其他】--结束");
                    if (!sc.next().equals("y")) {
                        System.out.println("目前余额为：" + card.getMoney());
                        break;
                    }
                }
                break;
            } else if (choose == 2) {
                CreditCard card = new CreditCard("招商银行", "2030/12/31", -20000);
                System.out.println("您已申请一张" + card.getCompany() + "银行的信用卡，卡号是" + card.getCardID() + "，卡片有效期到" + card.getValidateDate() + "，透支额度是" + (-card.getLimit()) + "元" + "，卡内余额为" + card.getMoney() + "元");
                int payCount = 0;
                while (true) {
                    System.out.println("请选择： 1. 还款  2. 刷卡");
                    int choose1 = sc.nextInt();
                    if (choose1 == 1) {
                        System.out.println("请输入还款金额：");
                        int cash = sc.nextInt();
                        if (card.deposit(cash)) {
                            System.out.println("还款成功");
                        } else {
                            System.out.println("还款失败");
                        }
                    } else if (choose1 == 2) {
                        System.out.println("请输入刷卡金额：");
                        double pay = sc.nextDouble();
                        if (card.consume(pay)) {
                            System.out.println("刷卡成功");
                            payCount++;
                            if (payCount % 3 == 0) {
                                card.setLimit(card.getLimit() - 500);
                            }
                        } else {
                            System.out.println("刷卡失败");
                        }
                    } else {
                        System.out.println("输入错误");
                    }
                    System.out.println("是否继续？ 【y】--继续  【其他】--结束");
                    if (!sc.next().equals("y")) {
                        System.out.println("目前余额为：" + card.getMoney() + "，透支限额为：" + (-card.getLimit()));
                        break;
                    }
                }
                break;
            } else {
                System.out.println("输入错误，请重新输入：");
            }
        }
    }
}
