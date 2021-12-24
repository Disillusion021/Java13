package com.coding.day09.继承;

public class TestCar {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        Benz benz = new Benz();
        System.out.print("BMW有汽车发动机" + bmw.engine + "个，型号为" + bmw.model + "，轮子" + bmw.wheel + "个，" + "马力为" + bmw.speed + "，价格为" + bmw.price + "，可以");
        bmw.drive();
        bmw.ability();
        System.out.print("Benz有汽车发动机" + benz.engine + "个，型号为" + benz.model + "，轮子" + benz.wheel + "个，" + "马力为" + benz.speed + "，价格为" + benz.price + "，可以");
        benz.drive();
        benz.ability();
    }
}
