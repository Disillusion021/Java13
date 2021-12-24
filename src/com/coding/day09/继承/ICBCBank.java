package com.coding.day09.继承;

public class ICBCBank extends Bank {
    private double factor = 0.005;

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    @Override
    public boolean saveMoney(double money) {
        if (money > 0 && money <= 100000) {
            this.money += money;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean getMoney(double money) {
        if (money > 0 && money < this.money - money * factor) {
            this.money -= money * (1 + factor);
            return true;
        } else {
            return false;
        }
    }
}
