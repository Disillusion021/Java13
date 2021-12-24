package com.coding.day10.多态;

public class TelePhone extends Phone {
    @Override
    public void call() {
        System.out.println("用手机打电话");
    }

    @Override
    public void answer() {
        System.out.println("用手机接电话");
    }

    public void receiveShortMessage() {
        System.out.println("接受短信");
    }
}
