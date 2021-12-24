package com.coding.day06.多方法程序设计;

import java.util.Scanner;

public class Demo3 {

    public static double carPrice(double distance) {
        double carCost = distance * 2;
        if (carCost > 500) {
            carCost = 500;
        }
        return carCost;
    }

    public static double truckPrice(double distance) {
        double truckCost = distance * 4;
        if (truckCost > 500) {
            truckCost = 500;
        }
        return truckCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你的汽车类型（1. 汽车  2. 卡车）：");
        int choose = sc.nextInt();
        if(choose == 1) {
            System.out.println("请输入行驶公里数：");
            double distance = sc.nextDouble();
            System.out.println("最终费用为：" + carPrice(distance));
        } else if(choose == 2) {
            System.out.println("请输入行驶公里数：");
            double distance = sc.nextDouble();
            System.out.println("最终费用为：" + truckPrice(distance));
        } else {
            System.out.println("车型选择错误");
        }
    }
}
