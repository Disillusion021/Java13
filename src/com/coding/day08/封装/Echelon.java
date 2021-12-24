package com.coding.day08.封装;

public class Echelon {

    private double bottom;
    private double top;
    private double height;

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (top + bottom) * height / 2;
    }
}
