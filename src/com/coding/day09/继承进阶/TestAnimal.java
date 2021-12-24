package com.coding.day09.继承进阶;

import java.util.Scanner;

public class TestAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入动物名:");
        String name = sc.next();
        System.out.println("请输入它有几条腿:");
        int legs = sc.nextInt();
        System.out.println("请输入它的颜色：");
        String color = sc.next();
        Cat c = new Cat(name, legs, color);
        System.out.println("请输入动物名:");
        name = sc.next();
        System.out.println("请输入它有几条腿:");
        legs = sc.nextInt();
        System.out.println("请输入它的颜色：");
        color = sc.next();
        Fish f = new Fish(name, legs, color);
        System.out.println("请输入动物名:");
        name = sc.next();
        System.out.println("请输入它有几条腿:");
        legs = sc.nextInt();
        System.out.println("请输入它的颜色：");
        color = sc.next();
        Bird b = new Bird(name, legs, color);
        c.showAnimal();
        c.sound();
        c.eat();
        f.showAnimal();
        f.sound();
        f.eat();
        f.swim(800);
        b.sound();
        b.eat();
        b.fly(60);
    }
}
