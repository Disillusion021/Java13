package com.coding.day02.分支语句4switch语句;

import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int day = sc.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 4:
            case 5:
                System.out.println("工作");
                break;
            case 3:
                System.out.println("外出工作");
                break;
            case 6:
                System.out.println("和同事吃饭");
                break;
            case 7:
                System.out.println("在家休息");
                break;
            default:
                System.out.println("星期不正确");
        }
    }
}
