package com.coding.day09.面向对象综合练习_封装_继承;

public class Bus extends Car {
    String startTime = "5:00";
    String endTime = "22:00";
    int passenger;

    public Bus() {
        passenger = 0;
    }

    public Bus(int passenger) {
        this.passenger = passenger;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("起始时间为：" + startTime + "，终止时间为：" + endTime + "，载客量为：" + passenger + "人");
    }

    public void function() {
        if (passenger > 50) {
            System.out.println("这是一辆大汽车，可以用作公交车");
        } else {
            System.out.println("这是一辆小汽车，可以用作班车");
        }
    }
}
