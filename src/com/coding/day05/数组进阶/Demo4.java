package com.coding.day05.数组进阶;

import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一共有多少个员工：");
        int num = sc.nextInt();
        double[] salary = new double[num];
        for (int i = 0; i < salary.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个员工的工资：");
            salary[i] = sc.nextDouble();
        }
        double sum = 0;
        double avg = 0;
        double max = salary[0];
        double min = salary[0];
        System.out.println("所有员工工资为：");
        for (double v : salary) {
            System.out.print(v + "  ");
            sum += v;
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }
        avg = sum / num;
        System.out.println();
        System.out.println("所有员工的平均工资为：" + avg);
        System.out.println("最高工资为：" + max + "，最低工资为：" + min);
    }
}
