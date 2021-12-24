package com.coding.day09.面向对象综合练习_封装_继承;

public class Car {
    String color;
    int tyres;

    public Car() {
        color = "黑色";
        tyres = 4;
    }

    public Car(String color, int tyres) {
        this.color = color;
        this.tyres = tyres;
    }

    public void show() {
        System.out.println("颜色为" + color + "，轮胎有" + tyres + "个");
    }
}
