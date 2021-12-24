package com.coding.day09.面向对象综合练习_封装_继承;

public class DebitCard extends BankCard {
    public DebitCard(String company, String validateDate) {
        super(company, validateDate);
    }

    @Override
    public boolean consume(double pay) {
        if (super.consume(pay) && getMoney() - pay >= 0) {
            setMoney(getMoney()-pay);
            return true;
        } else {
            return false;
        }
    }
}
