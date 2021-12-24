package com.coding.day08.封装;

public class Count {

    private int money = 1000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money > 1000) {
            this.money += money;
        } else {
            this.money -= money;
        }
    }
}
