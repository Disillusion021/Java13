package com.coding.day09.面向对象综合练习_封装_继承;

public class Bicycle extends Car{
    int type;

    public Bicycle() {
        type = 24;
    }

    public Bicycle(String color, int tyres, int type) {
        super(color, tyres);
        this.type = type;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("型号为：" + type);
    }

    public void ride() {
        if (type <= 16) {
            System.out.println("这个自行车适合儿童适用");
        } else {
            System.out.println("这个自行车适合成年人适用");
        }
    }
}
