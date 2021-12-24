package com.coding.day03.循环程序结构设计;

import java.util.Scanner;

public class Demo2_0 {

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
        //通过判断条件为循环做出口。三目减少行数，不用break打断循环，只考虑循环出口。
        for (int num = 10; num < 1 || num > 5; ) {
            System.out.print("请输入您选择的游戏：");
            num = sc.nextInt();
            System.out.println(num<1||num>5?"您输入的游戏编号无效，请重新输入！！":num==1?"您选择了wow":num==2?"您选择了传奇":num==3?"您选择了梦幻西游":num==4?"您选择了永恒之塔":"您选择了七龙珠ol");
        }
        System.out.println("请输入您现在已经玩到的级别：");
        int lv = sc.nextInt();
        System.out.println(lv<=20?"您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！":lv<=40?"您已经开始行走江湖，算是小有成就了，加油！！":lv<=60?"您已经横扫天下了，离天下无敌还有差距，继续努力吧！！":"您已经天下无敌了，太牛了！！！");
    }
}
