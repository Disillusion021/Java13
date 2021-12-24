package com.coding.day07.类和面向对象;

public class Count {

    int number;

    public void assign(int max) {
        if (max <= 0) {
            System.out.println("数字有误");
        } else {
            number = (int) (Math.random() * max) + 1;
        }
    }

    public boolean compare(int count) {
        return count > number;
    }
}
