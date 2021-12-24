package com.coding.day09.面向对象综合练习_封装_继承;

public class BusCard extends Card {
    private double mortgage;

    public BusCard() {
        super(20);
        setCompany("大连公交公司");
        mortgage = 30;
    }

    public double getMortgage() {
        return mortgage;
    }

    public void setMortgage(double mortgage) {
        this.mortgage = mortgage;
    }

    @Override
    public boolean deposit(int cash) {
        if (cash == 20 || cash == 50 || cash == 100) {
            setMoney(getMoney() + cash);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean consume(double pay) {
        if (super.consume(pay) && getMoney() - pay >= 0) {
            setMoney(getMoney() - pay * 0.95);
            return true;
        } else {
            return false;
        }
    }
}
