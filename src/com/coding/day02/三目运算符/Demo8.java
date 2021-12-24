package com.coding.day02.三目运算符;

import java.util.Scanner;

public class Demo8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高：");
        double hight = sc.nextDouble();
        System.out.println("请输入性别：");
        String  sex = sc.next();
        System.out.println(hight > 180 ? (sex.equals("男") ? "孔武有力" : "威武雄壮") : "瘦弱不堪");
    }
}
