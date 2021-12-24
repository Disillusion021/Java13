package com.coding.day10.多态;

public class Dog extends Beast {
    @Override
    public void ability() {
        System.out.println("我是Dog类中的ability方法，我不光会跑，我还会游泳");
    }
    public void action() {
        System.out.println("我是Dog类中的action方法，我还会后空翻");
    }
}
