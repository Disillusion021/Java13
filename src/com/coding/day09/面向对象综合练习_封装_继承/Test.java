package com.coding.day09.面向对象综合练习_封装_继承;

public class Test {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus(55);
        bus1.show();
        bus1.function();
        bus2.show();
        bus2.function();

        Autocycle c1 = new Autocycle();
        Autocycle c2 = new Autocycle("赤焰红",2,15,6);
        c1.show();
        c1.ride();
        c2.show();
        c2.ride();
    }
}
