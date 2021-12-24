package com.coding.day09.面向对象综合练习_封装_继承;

public class Card {
    private String company;
    private double money;
    private String cardID = "";

    public Card() {
        company = "大连发卡总行";
        money = 0;
        for (int i = 0; i < 8; i++) {
            cardID += (int) (Math.random() * 10);
        }
    }

    public Card(double money) {
        this();
        this.money = money;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardID() {
        return cardID;
    }

    public boolean deposit(int cash) {
        if (cash > 0) {
            money += cash;
            return true;
        } else {
            return false;
        }
    }

    public boolean consume(double pay) {
        if (pay > 0) {
            return true;
        } else {
            return false;
        }
    }

}
