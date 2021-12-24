package com.coding.day10.多态;

public class FixedPhone extends Phone {
    @Override
    public void call() {
        System.out.println("用座机打电话");
    }

    @Override
    public void answer() {
        System.out.println("用座机接电话");
    }

    public void connectInternet() {
        System.out.println("连接宽带");
    }
}
