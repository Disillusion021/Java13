package com.coding.day09.方法调用进阶;

public class Company {
    public Printer work(String type) {
        Printer p = new Printer();
        p.setType(type);
        return p;
    }

    public static void main(String[] args) {
        new Company().work("3d打印机").print();
    }
}
