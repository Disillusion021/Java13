package com.coding.day08.构造方法;

public class TestTime {
    public static void main(String[] args) {
        Time x1 = new Time(3,59, 59);
        x1.showTime();
        Time x2 = new Time(0,26, 26);
        x2.showTime();
        Time x3 = new Time(0,0, 24);
        x3.showTime();
    }
}
