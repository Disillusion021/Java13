package com.coding.day16;

import java.util.Scanner;

public class Demo4 {
    public static void add (double a, double b) throws Exception {
        double c = a / b;
        if (b == 0) {
            throw new MyException("除数不能为0！！！");
        } else {
            System.out.println(c);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        add(a, b);
    }
}
