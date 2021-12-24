package com.coding.day02.分支语句4switch语句;

import java.util.Scanner;
import java.util.Spliterator;

public class Demo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int grade = sc.nextInt();
        switch (grade/10) {
            case 6:
                System.out.println("及格");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 9:
                System.out.println("优秀");
                break;
            default:
                System.out.println("不及格");
        }
    }
}
