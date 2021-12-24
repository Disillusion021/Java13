package com.coding.day03.循环程序结构设计;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        A: for (; ; ) {
            System.out.println("请输入学生成绩：");
            double grade = sc.nextDouble();
            sum += grade;
            count++;
            // !confirm.equals("y") && !confirm.equals("n")
            B: for (String confirm = ""; ; ) {
                System.out.println("是否还有下一个成绩（【y】-是 【n】-否）");
                confirm = sc.next();
                switch (confirm) {
                    case "y":
                        break B;
                    case "n":
                        break A;
                    default:
                        System.out.println("输入有误，请重新输入：");
                }
            }
        }
        System.out.print("学生人数为" + count);
        System.out.println("，总成绩为" + sum);
    }
}
