package com.coding.day06.多方法程序设计;

import java.util.Scanner;

public class Demo4 {

    public static double getAvg(double...salarys){
        double sum = 0;
        for (double i : salarys) {
            sum += i;
        }
        return sum/salarys.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个员工工资：");
        double salary1 = sc.nextInt();
        System.out.println("请输入第二个员工工资：");
        double salary2 = sc.nextInt();
        System.out.println("请输入第三个员工工资：");
        double salary3 = sc.nextInt();
        System.out.println("工资的平均值为：" + getAvg(salary1, salary2, salary3));
    }
}
