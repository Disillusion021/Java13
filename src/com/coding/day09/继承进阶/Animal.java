package com.coding.day09.继承进阶;

public class Animal {
    private String name;
    private int legs;
    private String color;

    public Animal(String name, int legs, String color) {
        this.name = name;
        this.legs = legs;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showAnimal() {
        System.out.println("这是一只" + color + "色的" + name + "，它有" + legs + "条腿");
    }

    public void sound() {
        System.out.println("我是" + name + "，我能发出很大的叫声");
    }

    public void eat() {
        System.out.println("我是一个动物，我什么都吃");
    }
}
