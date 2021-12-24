package com.coding.day01.java基本语法;

import java.util.Scanner;

public class Demo4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入小红摘的苹果数：");
        int hong = sc.nextInt();
        System.out.println("1个小朋友一共摘了" + hong + "苹果");
        System.out.println("请输入小刚摘的苹果数：");
        int gang = sc.nextInt();
        System.out.println("2个小朋友一共摘了" +(hong + gang) + "苹果");
        System.out.println("请输入小丽摘的苹果数：");
        int li = sc.nextInt();
        System.out.println("3个小朋友一共摘了" +(hong +gang + li) +  "苹果");
        System.out.println("请输入小玉摘的苹果数：");
        int yu = sc.nextInt();
        System.out.println("4个小朋友一共摘了" + (hong + gang + li + yu) + "苹果");



    }
}
