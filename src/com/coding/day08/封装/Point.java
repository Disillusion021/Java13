package com.coding.day08.封装;

public class Point {

    private int x1;
    private int y1;
    private int z1;


    public void setX1(int x1) {
        this.x1 = x1;
    }


    public void setY1(int y1) {
        this.y1 = y1;
    }


    public void setZ1(int z1) {
        this.z1 = z1;
    }

    public double getLength() {
        return Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
    }
}
