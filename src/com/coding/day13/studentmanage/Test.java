package com.coding.day13.studentmanage;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请根据提示注册账号");
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        System.out.println("请再次输入密码确认：");
        String confirmPassword = sc.next();
        System.out.println("请输入邮箱：");
        String email = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        RegisterAndLogin r = new RegisterAndLogin();
        boolean rTag = r.register(username, password, confirmPassword, email, age);
        if (rTag) {
            System.out.println("注册成功");
        } else {
            System.out.println("注册失败");
            return;
        }
        String choose;
        while (true) {
            System.out.println("请登录");
            System.out.println("输入用户名：");
            String username1 = sc.next();
            System.out.println("请输入密码：");
            String password1 = sc.next();
            boolean lTag = r.login(username1, password1);
            if (lTag) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败");
            }
            System.out.println("请选择：【y】- 重试 【其他】-退出");
            choose = sc.next();
            if (!choose.equals("y")) {
              return;
            }
        }
        System.out.println("请录入学生信息");
        Student[] students = new Student[100];
        while (true) {
            Student student = new Student();
            System.out.println("请输入学生姓名：");
            String stuName = sc.next();
            System.out.println("请输入学生年龄：");
            int stuAge = sc.nextInt();
            students = student.add(students, student, stuName, stuAge);
            System.out.println("请选择：【y】- 继续录入 【其他】-停止录入");
            choose = sc.next();
            if (!choose.equals("y")) {
                break;
            }
        }

        System.out.println("全部学生信息如下：");
        for (Student s : students) {
            if (s != null) {
                System.out.println("姓名：" + s.getStuName() + "年龄：" + s.getStuAge());
            } else {
                break;
            }
        }
    }
}
