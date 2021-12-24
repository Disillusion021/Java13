package com.coding.day08.方法重载;

public class Draw {

    double drawRound;

    public void round(double r) {
        drawRound = 2 * Math.PI * r;
    }

    public void round(int length, int width) {
        drawRound = 2 * (length + width);
    }

    public void round(int length) {
        drawRound = 4 * length;
    }

    public void round(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            drawRound = a + b + c;
        } else {
            System.out.println("构不成三角形");
        }
    }
}
