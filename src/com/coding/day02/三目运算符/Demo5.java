package com.coding.day02.三目运算符;

import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入积分：");
        double points = sc.nextDouble();
        System.out.println("您的积分为" + points + (points > 1000 ? "，是Vip会员" : "，为普通会员"));
    }
}
