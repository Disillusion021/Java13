package com.coding.day07.类和面向对象;

public class Demo2 {

    public static void main(String[] args) {
        new Programmer().showProgrammer();
        Programmer xiaoMing = new Programmer();
        xiaoMing.salary = 6000;
        xiaoMing.name = "小明";
        xiaoMing.showProgrammer();
    }
}
