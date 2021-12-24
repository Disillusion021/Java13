package com.coding.day11.抽象扩展题;

import com.coding.day11.抽象类.TeacherMessage;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentArray studentArray = new StudentArray();
        while (true) {
            System.out.println("请选择：1. 添加  2. 修改  3. 查询  4. 退出");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("请输入学号：");
                int no = sc.nextInt();
                System.out.println("请输入姓名：");
                String name = sc.next();
                System.out.println("请输入年龄：");
                int age = sc.nextInt();
                Student student = studentArray.creatStudent(no, name, age);
                studentArray.addStudent(student);
            } else if (choose == 2) {
                System.out.println("请输入学号：");
                int no = sc.nextInt();
                System.out.println("请输入姓名：");
                String name = sc.next();
                System.out.println("请输入年龄：");
                int age = sc.nextInt();
                studentArray.updateStudent(no, name, age);
            } else if (choose == 3) {
                studentArray.showStudent();
            } else if (choose == 4) {
                System.out.println("退出成功");
                break;
            } else {
                System.out.println("输入错误，请重试");
            }
        }
    }
}
