package com.coding.day02.分支语句4switch语句;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第2个整数");
        int b = sc.nextInt();
        System.out.println("请输入运算符：");
        String s = sc.next();
        switch (s){
            case "+":
                System.out.println(a + " " + s + " " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + " " + s + " " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + " " + s + " " + b + " = " + (a * b));
                break;
            case "/":
                System.out.println(a + " " + s + " " + b + " = " + (a / b));
                break;
            default:
                System.out.println("符号错误");
        }
    }
}
