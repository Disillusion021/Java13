package com.coding.Test.泛型;

import com.coding.day09.继承.Dog;

public class TestGeneric {
    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);
        apple.fly(new Dog());
        apple.eat(423.4321);
    }
}

class Apple<T, R, M> {
    public <E> void fly(E e) {
        System.out.println(e.getClass().getSimpleName());
    }

    public void eat(M m) {
        System.out.println(m.getClass().getSimpleName());
    }
}