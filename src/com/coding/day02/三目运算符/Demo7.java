package com.coding.day02.三目运算符;

import java.util.Scanner;

public class Demo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入百米跑成绩：");
        double time  = sc.nextDouble();
        System.out.println("请输入性别：");
        String sex = sc.next();
        System.out.println(time < 12 ? "进入" + sex + "子组决赛" : "淘汰");
    }
}
