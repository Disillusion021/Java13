package com.coding.day09.继承;

public class Dog extends Animal{

    int weight = 15;
    int age = 3;

    public void showDog() {
        System.out.println("狗狗有" + leg + "条腿，有" + tail + "条尾巴，今年" + age + "岁，体重" + weight + "斤");
    }
}
