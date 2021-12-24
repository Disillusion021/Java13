package com.coding.day11.接口;

public class Car implements Charge{
    @Override
    public double getMoney(double distance) {
        double money = distance;
        if (money > MAX_MONEY) {
            money = 1000;
        }
        return money;
    }
}
