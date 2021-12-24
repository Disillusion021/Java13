package com.coding.day01.分支语句1;

import java.util.Scanner;

public class Demo18_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int x = sc.nextInt();
        if(x % 3 == 0) {
            System.out.print("能被3整除");
        } else {
            System.out.print("不能被3整除");
        }
        if(x % 5 == 0) {
            System.out.print("，能被5整除");
        } else {
            System.out.print("，不能被5整除");
        }
        if(x % 7 == 0) {
            System.out.print("，能被7整除");
        } else {
            System.out.print("，不能被7整除");
        }
    }
}
