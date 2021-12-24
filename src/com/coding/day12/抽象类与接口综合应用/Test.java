package com.coding.day12.抽象类与接口综合应用;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("请根据提示完成注册");
        System.out.println("请输入用户名（6位以上）：");
        String username = sc.next();
        System.out.println("请输入密码（6-14位之间）：");
        String password = sc.next();
        System.out.println("请输入确认密码：");
        String confirmPassword = sc.next();
        if (user.reg(username, password, confirmPassword)) {
            System.out.println("注册成功");
        } else {
            System.out.println("注册失败，程序结束");
            return;
        }
        System.out.println("请输入用户名：");
        String username1 = sc.next();
        System.out.println("请输入密码：");
        String password1 = sc.next();
        if (user.login(username1, password1)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败，程序结束");
            return;
        }

        IPerson[] iPeople = new IPerson[100];
        IPerson iPerson;
        do {
            while (true) {
                System.out.println("请输入会员类型：1-儿童 2-学生 3-成人");
                int choose = sc.nextInt();
                if (choose == 1) {
                    iPerson = new Child();
                    break;
                } else if (choose == 2) {
                    iPerson = new Student();
                    break;
                } else if (choose == 3) {
                    iPerson = new Adult();
                    break;
                } else {
                    System.out.println("输入错误，请重新选择");
                }
            }
            System.out.println("请输入会员姓名：");
            String name = sc.next();
            System.out.println("请输入会员年龄：");
            int age = sc.nextInt();
            System.out.println("请输入会员性别：");
            String sex = sc.next();
            iPeople = iPerson.add(iPeople, iPerson, name, age, sex);
            System.out.println("是否继续录入：【y】-继续录入 【n】-停止录入");
        } while (!sc.next().equals("n"));
        for (int i = 0; i < iPeople.length; i++) {
            if (iPeople[i] == null) break;
            System.out.println("第" + (i + 1) + "个会员，" + "会员类型：" + (iPeople[i] instanceof Child?"儿童":iPeople[i] instanceof Student?"学生":"成人") + "，姓名：" + iPeople[i].getName() + "，年龄：" + iPeople[i].getAge() + "，性别：" + iPeople[i].getSex());
        }
    }

}
