package com.coding.day09.面向对象综合练习_封装_继承;

import java.util.Scanner;

public class TestBusCard {
    public static void main(String[] args) {
        BusCard busCard = new BusCard();
        System.out.println("您已申请一张" + busCard.getCompany() + "公司的乘车卡，卡号是" + busCard.getCardID() + "，押金" + busCard.getMortgage() + "元，卡内余额为" + busCard.getMoney() + "元");
        System.out.println("请输入充值金额（20元，50元，100元）：");
        if (busCard.deposit(new Scanner(System.in).nextInt())) {
            System.out.println("充值成功");
            for (int i = 0; i < 10; i++) {
                if (busCard.consume((int)(Math.random() * 5 + 1))) {
                    System.out.println("刷卡成功");
                    System.out.println("卡内余额为：" + busCard.getMoney());
                } else {
                    System.out.println("刷卡失败,卡内余额不足");
                    System.out.println("卡内余额为：" + busCard.getMoney());
                }
            }
        } else {
            System.out.println("充值失败");
        }
    }
}
