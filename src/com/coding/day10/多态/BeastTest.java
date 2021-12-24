package com.coding.day10.多态;

public class BeastTest {
    public static void main(String[] args) {
        Beast catBeast = new Cat();
        Beast dogBeast = new Dog();
        catBeast.ability();
        ((Cat)catBeast).action();
        dogBeast.ability();
        ((Dog)dogBeast).action();
    }
}
