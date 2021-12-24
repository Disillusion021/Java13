package com.coding.day08.方法重载;

import java.util.Scanner;

public class TestDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Draw x = new Draw();
        System.out.println("请选择对应的图形： 1. 圆形  2. 长方形  3. 正方形  4. 三角形");
        int choose = sc.nextInt();
        if (choose == 1) {
            System.out.print("请输入圆形的半径：");
            double r = sc.nextInt();
            x.round(r);
            System.out.println("周长为：" + x.drawRound);
        }
        if (choose == 2) {
            System.out.print("请输入长方形的长：");
            int length = sc.nextInt();
            System.out.print("请输入长方形的宽：");
            int width = sc.nextInt();
            x.round(length,width);
            System.out.println("周长为：" + x.drawRound);
        }
        if (choose == 3) {
            System.out.print("请输入正方形的边长：");
            int length = sc.nextInt();
            x.round(length);
            System.out.println("周长为：" + x.drawRound);
        }
        if (choose == 4) {
            System.out.print("请输入三角形的第一条边：");
            int a = sc.nextInt();
            System.out.print("请输入三角形的第二条边：");
            int b = sc.nextInt();
            System.out.print("请输入三角形的第三条边：");
            int c = sc.nextInt();
            x.round(a, b, c);
            System.out.println("周长为：" + x.drawRound);
        }
        if (choose < 1 || choose > 4) {
            System.out.println("输入错误，程序结束");
        }
    }
}
