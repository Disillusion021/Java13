package com.coding.day09.继承进阶;

public class Cat extends Animal {
    public Cat(String name, int legs, String color) {
        super(name, legs, color);
    }

    @Override
    public void sound() {
        System.out.println("我是" + getName() + "，喵喵喵");
    }

    @Override
    public void eat() {
        System.out.println("我是" + getName() + "我爱吃猫粮");
    }
}
