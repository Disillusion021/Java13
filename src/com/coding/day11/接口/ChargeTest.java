package com.coding.day11.接口;

import java.util.Scanner;

public class ChargeTest {
    public static void main(String[] args) {
        Charge charge;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择车型：1. 汽车 2. 卡车");
            int choose = sc.nextInt();
            if (choose == 1) {
                charge = new Car();
                break;
            } else if (choose == 2) {
                charge = new Truck();
                break;
            } else {
                System.out.println("请重新输入");
            }
        }
        System.out.println("请输入公里数：");
        double distance = sc.nextDouble();
        System.out.println("费用为" + charge.getMoney(distance));
    }
}
