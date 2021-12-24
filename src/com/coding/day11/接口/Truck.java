package com.coding.day11.接口;

public class Truck implements Charge{
    @Override
    public double getMoney(double distance) {
        double money = distance * 1.5;
        if (money > MAX_MONEY) {
            money = 1000;
        }
        return money;
    }
}
