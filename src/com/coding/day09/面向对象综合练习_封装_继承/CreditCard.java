package com.coding.day09.面向对象综合练习_封装_继承;

public class CreditCard extends BankCard{
    private double limit;

    public CreditCard(String company, String validateDate, double limit) {
        super(company, validateDate);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public boolean consume(double pay) {
        if (super.consume(pay) && getMoney() - pay >= limit) {
            setMoney(getMoney() - pay);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deposit(int cash) {
        if (cash > 0 && getMoney() + cash >= 0) {
            setMoney(cash + getMoney());
            return true;
        } else {
            return false;
        }
    }
}
