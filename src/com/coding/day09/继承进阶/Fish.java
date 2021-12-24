package com.coding.day09.继承进阶;

public class Fish extends Animal {
    public Fish(String name, int legs, String color) {
        super(name, legs, color);
    }

    @Override
    public void sound() {
        System.out.println("我是" + getName() + "，我叫唤不能");
    }

    @Override
    public void eat() {
        System.out.println("我是" + getName() + "我爱吃鱼食");
    }

    public void swim(int meter) {
        System.out.println("老子是条快鱼，每分钟能游" + meter + "米");
    }
}
