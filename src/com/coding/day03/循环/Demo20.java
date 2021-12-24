package com.coding.day03.循环;

public class Demo20 {
    public static void main(String[] args) {
        double money = 0;
        for (int i = 1; i <= 30 ; i++) {
            money += Math.pow(2,i-1);
        }
        System.out.println("小明共需要支付彩礼费：" + money / 100 + "元");
    }
}
