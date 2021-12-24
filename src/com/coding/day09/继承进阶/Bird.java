package com.coding.day09.继承进阶;

public class Bird extends Animal {

    public Bird(String name, int legs, String color) {
        super(name, legs, color);
    }

    @Override
    public void eat() {
        System.out.println("我是" + getName() + "我爱吃面包虫");
    }

    public void fly(int minutes) {
        System.out.println("本鸟可以连续飞" + minutes + "分钟");
    }
}
