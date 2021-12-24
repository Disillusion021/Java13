package com.coding.day11.抽象类;

public class Test22 extends AbstractTest{

    @Override
    public int f1(int a, int b) {
        return a * b;
    }

    @Override
    public String f2(String name, int age) {
        return name + (age + 2);
    }
}
