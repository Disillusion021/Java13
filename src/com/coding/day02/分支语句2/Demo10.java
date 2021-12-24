package com.coding.day02.分支语句2;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Demo10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        System.out.println("请输入运算符：");
        String s = sc.next();
        if (s.equals("+")) {
            System.out.println(a + " " + s + " " + b + " = " + (a + b));
        }
        if (s.equals("-")) {
            System.out.println(a + " " + s + " " + b + " = " + (a - b));
        }
        if (s.equals("*")) {
            System.out.println(a + " " + s + " " + b + " = " + (a * b));
        }
        if (s.equals("/")) {
            System.out.println(a + " " + s + " " + b + " = " + (a / b));
        }
    }
}
