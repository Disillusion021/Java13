package com.coding.day08.封装;

public class ChinaBank {

    private double money = 20000;
    private int password = 123456;

    public boolean check(int p) {
        return p == password;
    }

    public void saveMoney(double money) {
        if (money > 0) {
            this.money += money;
            System.out.println("存入成功！");
        } else {
            System.out.println("哥们，你想啥呢？");
        }
    }

    public void drawMoney(double money) {
        if (money <= this.money && money > 0) {
            this.money -= money;
            System.out.println("取出成功！");
        } else {
            System.out.println("取钱失败");
        }
    }

    public double getMoney() {
        return money;
    }
}
