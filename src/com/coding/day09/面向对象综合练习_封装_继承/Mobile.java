package com.coding.day09.面向对象综合练习_封装_继承;

public class Mobile {
    private String mobileName;
    private String mobileSize = "";
    private double mobilePrize;

    public Mobile() {
    }

    public Mobile(String mobileName, String mobileSize, double mobilePrize) {
        this.mobileName = mobileName;
        this.mobileSize = mobileSize;
        this.mobilePrize = mobilePrize;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getMobileSize() {
        return mobileSize;
    }

    public void setMobileSize(String mobileSize) {
        this.mobileSize = mobileSize;
    }

    public double getMobilePrize() {
        return mobilePrize;
    }

    public void setMobilePrize(double mobilePrize) {
        this.mobilePrize = mobilePrize;
    }
}
