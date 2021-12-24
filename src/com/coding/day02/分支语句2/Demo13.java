package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品的价格：");
        double price = sc.nextDouble();
        System.out.println("请输入商品的数量：");
        int num = sc.nextInt();
        double discount = 0;
        if (num >= 30) {
            discount = 0.06;
        } else if (num >= 20){
            discount = 0.04;
        } else if (num >= 10) {
            discount = 0.02;
        } else {
            discount = 0.01;
        }
        System.out.println("折扣率为" + discount*100 + "%，总价格为" + price * num + "元，实际应付" + price * num * (1 - discount) + "元");
    }
}
