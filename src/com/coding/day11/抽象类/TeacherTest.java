package com.coding.day11.抽象类;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher teacher = new Teacher();
        while (true) {
            System.out.println("请选择：1.添加老师信息 2.修改老师信息 3. 查询老师个人信息 4. 退出");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("请输入姓名：");
                String name = sc.next();
                System.out.println("请输入年龄：");
                int age = sc.nextInt();
                teacher = new TeacherMessage().add(name, age);
                System.out.println("添加成功");
            } else if (choose == 2) {
                System.out.println("请输入修改后的姓名：");
                String name = sc.next();
                System.out.println("请输入修改后的年龄：");
                int age = sc.nextInt();
                teacher = new TeacherMessage().update(teacher, name, age);
                System.out.println("修改成功");
            } else if (choose == 3) {
                new TeacherMessage().showTeacher(teacher);
            } else if (choose == 4) {
                System.out.println("退出成功");
                break;
            } else {
                System.out.println("输入错误，请重试");
            }
        }
    }
}
