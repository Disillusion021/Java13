package com.coding.day08.封装;

public class MathCount {

    private int count;

    public int getCount() {
        return (count / 1000 % 10 + count / 100 % 10 + count / 10 % 10 + count % 10);
    }

    public void setCount(int count) {
        if (count <= 1000) {
            this.count = count;
        } else {
            System.out.println("打印值过大");
        }
    }
}
