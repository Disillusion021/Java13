package com.coding.day11.接口;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        int no = sc.nextInt();
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入专业：");
        int profession = sc.nextInt();
        System.out.println("请输入分数：");
        double score = sc.nextDouble();
        new StudentSelectImpl().selectStudent(new StudentAddImpl().addStudent(no, name, profession, score));
    }
}
