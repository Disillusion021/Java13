package com.coding.day09.方法调用进阶;

public class People {
    public void feed(Animal a1, String food) {
        a1.food = food;
        a1.eat();
    }

    public static void main(String[] args) {
        new People().feed(new Animal(),"粑粑");
    }
}
