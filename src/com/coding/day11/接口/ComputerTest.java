package com.coding.day11.接口;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computerImpl1 = new ComputerImpl1();
        Computer computerImpl2 = new ComputerImpl2();
        Computer computerImpl3 = new ComputerImpl3();
        Computer computerImpl4 = new ComputerImpl4();
        System.out.println(computerImpl1.calculate(10, 2.5));
        System.out.println(computerImpl2.calculate(10, 2.5));
        System.out.println(computerImpl3.calculate(10, 2.5));
        System.out.println(computerImpl4.calculate(10, 2.5));
    }
}
