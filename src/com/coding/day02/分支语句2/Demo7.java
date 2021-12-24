package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入百米跑成绩");
        double score = sc.nextDouble();
        if (score < 10) {
            System.out.println("请输入性别");
            String sex = sc.next();
            System.out.println("进入" + sex + "子组决赛");
        } else {
            System.out.println("淘汰");
        }
    }
}
