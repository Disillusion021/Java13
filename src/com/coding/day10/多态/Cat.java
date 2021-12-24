package com.coding.day10.多态;

public class Cat extends Beast {
    @Override
    public void ability() {
        System.out.println("我是Cat类中的ability方法，我不光会跑，我还会爬墙");
    }
    public void action() {
        System.out.println("我是Cat类中的action方法，我还会挠人");
    }
}
