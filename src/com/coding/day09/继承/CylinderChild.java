package com.coding.day09.继承;

public class CylinderChild extends Cylinder {

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }
}
