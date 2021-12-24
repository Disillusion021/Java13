package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期：");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("星期一，吃米饭");
        }
        if (x == 2) {
            System.out.println("星期二，吃面条");
        }
        if (x == 3) {
            System.out.println("星期三，吃馒头");
        }
        if (x == 4) {
            System.out.println("星期四，吃饺子");
        }
        if (x == 5) {
            System.out.println("星期五，吃海鲜");
        }
        if (x == 6) {
            System.out.println("星期六，吃麻辣烫");
        }
        if (x == 7) {
            System.out.println("星期日，吃方便面");
        }
        if (x > 7 || x < 1){
            System.out.println("输出星期不正确");
        }
    }
}
