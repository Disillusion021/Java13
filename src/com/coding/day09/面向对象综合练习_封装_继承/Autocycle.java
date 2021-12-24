package com.coding.day09.面向对象综合练习_封装_继承;

public class Autocycle extends Bicycle{
    int gas;

    public Autocycle() {
    }

    public Autocycle(String color, int tyres, int type, int gas) {
        super(color, tyres, type);
        this.gas = gas;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("百公里耗油：" + gas);
    }
}
