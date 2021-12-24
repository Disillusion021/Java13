package com.coding.day07.类和面向对象;

public class Bank {
    int money = 10000;

    public void getMoney(int m1) {
        if (m1 > money) {
            System.out.println("余额不足");
        } else {
            money -= m1;
        }
    }

    public void saveMoney(int m2) {
        money += m2;
    }

    public void selectMoney() {
        System.out.println("当前账户余额为" + money);
    }
}
