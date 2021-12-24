package com.coding.day09.方法调用进阶;

public class Printer {
    String type;

    public void setType(String type) {
        this.type = type;
    }

    public void print() {
        if (type.equals("黑白打印机")) {
            System.out.println("打印黑白画面");
        } else if (type.equals("彩色打印机")) {
            System.out.println("打印彩色画面");
        } else if (type.equals("3d打印机")) {
            System.out.println("打印3d画面");
        } else {
            System.out.println("打印机类型有误");
        }
    }
}
