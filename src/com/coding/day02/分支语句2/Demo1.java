package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        double max = sc.nextDouble();
        System.out.println("请输入第二个数：");
        double b = sc.nextDouble();
        System.out.println("请输入第三个数：");
        double c = sc.nextDouble();
        //按顺序和擂主比大小
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("结果：最大值为" + max);
    }
}
