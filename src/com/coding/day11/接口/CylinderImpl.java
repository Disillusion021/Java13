package com.coding.day11.接口;

public class CylinderImpl implements Cylinder {

    @Override
    public double getVolume(double area, double height) {
        return area * height;
    }
}
