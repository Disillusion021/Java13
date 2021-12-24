package com.coding.day11.接口;

public class CircleImpl implements Circle{
    @Override
    public double getArea(double radius) {
        return PAI * radius * radius;
    }
}
