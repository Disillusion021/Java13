package com.coding.day03.循环程序结构设计;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("现有游戏如下");
        System.out.println("--------------------");
        System.out.println("1、wow");
        System.out.println("2、传奇");
        System.out.println("3、梦幻西游");
        System.out.println("4、永恒之塔");
        System.out.println("5、七龙珠ol");
        System.out.println();
        //定义输入循环为死循环，利用分支语句结束循环。
        输入循环 :
        for(; ; ) {
            System.out.print("请输入您选择的游戏：");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("您选择了wow");
                    break 输入循环;
                case 2:
                    System.out.println("您选择了传奇");
                    break 输入循环;
                case 3:
                    System.out.println("您选择了梦幻西游");
                    break 输入循环;
                case 4:
                    System.out.println("您选择了永恒之塔");
                    break 输入循环;
                case 5:
                    System.out.println("您选择了七龙珠ol");
                    break 输入循环;
                default:
                    System.out.println("您输入的游戏编号无效，请重新输入！！");
            }
        }
        System.out.println("请输入您现在已经玩到的级别：");
        int lv = sc.nextInt();
        System.out.println(lv<=20?"您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！":lv<=40?"您已经开始行走江湖，算是小有成就了，加油！！":lv<=60?"您已经横扫天下了，离天下无敌还有差距，继续努力吧！！":"您已经天下无敌了，太牛了！！！");
    }
}
