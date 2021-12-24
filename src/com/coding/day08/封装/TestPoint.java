package com.coding.day08.封装;

import java.util.Scanner;

public class TestPoint {

    public static void main(String[] args) {
        Point a = new Point();
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个坐标");
            x[i] = sc.nextInt();
        }
        a.setX1(x[0]);
        a.setY1(x[1]);
        a.setZ1(x[2]);
        System.out.println("该点距原点的距离为：" + a.getLength());
    }
}
