package com.coding.day15.集合综合应用;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentServiceImpl ss = new StudentServiceImpl();
        TeacherServiceImpl ts = new TeacherServiceImpl();
        TeacherAndStudentService tas = new TeacherAndStudentServiceImpl();
        while (true) {
            System.out.println("1. 添加学生  2. 添加老师  3. 更改  4. 删除  5. 查询  6. 退出");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("请输入学号：");
                int id = sc.nextInt();
                System.out.println("请输入姓名：");
                String name = sc.next();
                System.out.println("请输入班级：");
                int classNo = sc.nextInt();
                System.out.println("请输入成绩：");
                int score = sc.nextInt();
                Student s = new Student(id, name, classNo, score);
                ss.addStudent(s);
                System.out.println("添加成功");
            } else if (choose == 2) {
                System.out.println("请输入工号：");
                int id = sc.nextInt();
                System.out.println("请输入姓名：");
                String name = sc.next();
                System.out.println("请输入主讲科目：");
                String course = sc.next();
                System.out.println("请输入班级：");
                int classNo = sc.nextInt();
                Teacher t = new Teacher(classNo, id, name, course);
                ts.addTeacher(t);
                System.out.println("添加成功");
            } else if (choose == 3) {
                System.out.println("请选择：1.更改学生 2.更改老师");
                int choose2 = sc.nextInt();
                if (choose2 == 1) {
                    System.out.println("学生学号如下：");
                    ss.selectNo();
                    System.out.println("请输入更改学生的学号：");
                    int id = sc.nextInt();
                    ss.updateStudent(id);
                    System.out.println("更改成功");
                } else {
                    System.out.println("老师工号如下：");
                    ts.selectNo();
                    System.out.println("请输入更改老师的工号：");
                    int id = sc.nextInt();
                    ts.updateTeacher(id);
                    System.out.println("更改成功");
                }
            } else if (choose == 4) {
                System.out.println("请选择：1.删除学生 2.删除老师");
                int choose2 = sc.nextInt();
                if (choose2 == 1) {
                    System.out.println("学生学号如下：");
                    ss.selectNo();
                    System.out.println("请输入要删除的学生的学号：");
                    int id = sc.nextInt();
                    ss.deleteStudent(id);
                    System.out.println("删除成功");
                } else {
                    System.out.println("老师工号如下：");
                    ts.selectNo();
                    System.out.println("请输入要删除的老师的工号:");
                    int id = sc.nextInt();
                    ts.deleteTeacher(id);
                    System.out.println("删除成功");
                }
            } else if (choose == 5) {
                System.out.println("请选择：1. 查询学生  2. 查询老师  3. 查询科目对应老师信息  4. 查询班级最高分  5. 查询班级全部信息");
                int choose2 = sc.nextInt();
                if (choose2 == 1) {
                    System.out.println("学生信息如下");
                    ss.selectStudent();
                    ss.selectStudentCount();
                } else if (choose2 == 2) {
                    System.out.println("老师信息如下");
                    ts.selectTeacher();
                    ts.selectTeacherCount();
                } else if (choose2 == 3) {
                    System.out.println("请输入科目：");
                    String course = sc.next();
                    System.out.println("主讲这门科目的教师为：");
                    ts.selectTeacherByCourse(course);
                } else if (choose2 == 4) {
                    System.out.println("所有班级如下");
                    ss.selectClass();
                    System.out.println("请输入要查询的班级：");
                    ss.selectMaxScore(sc.nextInt());
                } else if (choose2 == 5) {
                    System.out.println("所有班级如下");
                    ss.selectClass();
                    System.out.println("请输入班级：");
                    tas.selectStudentAndTeacher(sc.nextInt());
                }
            } else if (choose == 6) {
                System.out.println("退出成功");
                break;
            } else {
                System.out.println("输入错误，请重试");
            }
        }
    }
}
