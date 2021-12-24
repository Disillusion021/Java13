package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sc.nextDouble();
        if (score < 0 || score >100) {
            System.out.println("成绩输入错误");
        } else if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60){
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
