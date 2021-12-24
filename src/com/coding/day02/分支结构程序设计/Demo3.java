package com.coding.day02.分支结构程序设计;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的消费金额：");
        double cost = sc.nextDouble();
        if (cost < 0) {
            System.out.println("消费金额无效");
        } else if (cost < 2000) {
            System.out.println("您的消费金额不足2000，只能使用现金支付，不能享受任何打折的优惠，您的实际支付金额为" + cost + "元");
        } else {
            System.out.println("请输入您是否为会员（【y】- 会员，【其它】- 非会员）：");
            String member = sc.next();
            if (member.equals("y")) {
                for (String way = " "; !way.equals("Cash") && !way.equals("Alipay") && !way.equals("WeChat"); ) {
                    System.out.println("请输入您的支付方式（【Cash】-现金支付 【Alipay】-支付宝支付 【WeChat】-微信支付）：");
                    way = sc.next();
                    switch (way) {
                        case "Cash":
                            System.out.println("您消费" + cost + "元，并且为会员，选择了现金支付，可以享受8折优惠，您的实际支付金额为" + cost * 0.8 + "元");
                            break;
                        case "Alipay":
                            System.out.println("您消费" + cost + "元，并且为会员，选择了支付宝支付，可以享受8.5折优惠，您的实际支付金额为" + cost * 0.85 + "元");
                            break;

                        case "WeChat":
                            System.out.println("您消费" + cost + "元，并且为会员，选择了微信支付，可以享受9折优惠，您的实际支付金额为" + cost * 0.9 + "元");
                            break;
                        default:
                            System.out.println("您输入的支付方式有误，请重新输入");
                    }
                }
            } else {
                System.out.println("您消费" + cost + "元，但不是会员，只能使用现金支付方式，可以享受9.5折优惠，您的实际支付金额为" + cost * 0.95 + "元");
            }
        }
    }
}
