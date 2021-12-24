package com.coding.day06.多方法程序设计;

class Draw {

    public static double calculateArea(double a, double b, double c) {
        return Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
    }

}
