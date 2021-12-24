package com.coding.day08.封装;

import java.util.Scanner;

public class TestCount {

    public static void main(String[] args) {
        Count m = new Count();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int money = sc.nextInt();
        m.setMoney(money);
        System.out.println(m.getMoney());
    }
}
