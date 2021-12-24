package com.coding.day03.随机数;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        //注册
        Scanner sc = new Scanner(System.in);
        System.out.println("请先根据提示完成注册");
        System.out.print("用户名（至少5字符以上）：");
        String name1 = sc.next();
        System.out.print("密码（长度在6-14位之间）：");
        String password1 = sc.next();
        System.out.print("请再次输入密码：");
        String password2 = sc.next();
        if (name1.length() < 5) {
            System.out.println("用户名的长度至少在5个字符以上");
            return;
        } else if (password1.length() < 6 || password1.length() > 14) {
            System.out.println("密码长度应在6-14位之间");
            return;
        } else if (!password1.equals(password2)) {
            System.out.println("两次密码输入不一致");
            return;
        } else {
            System.out.println("。。。。。。");
            System.out.println("注册成功，请进行登录");
        }
        //登录
        System.out.print("用户名：");
        String name2 = sc.next();
        System.out.print("密码：");
        String password = sc.next();
        String code1 = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10) + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        System.out.print("验证码" + "【" + code1 + "】：");
        String code2 = sc.next();
        System.out.println();
        if (!name2.equals(name1) || !password.equals(password1)) {
            System.out.println("您输入的用户名或密码错误");
            return;
        } else if (!code2.equals(code1)) {
            System.out.println("验证码错误");
            return;
        } else {
            System.out.println("恭喜您登录成功，即将进入点餐系统！！");
        }
        System.out.println("。。。。。。");
        //点餐
        System.out.println("您需要炒饼还是炒面（炒饼【1】  炒面【2】）");
        String choose = sc.next();
        switch (choose) {
            case "1":
                System.out.println("您需要鱿鱼炒饼还是鸡蛋炒饼（鱿鱼炒饼【1】  鸡蛋炒饼【2】）");
                int choose1 = sc.nextInt();
                System.out.println("您选择了" + (choose1 == 1 ? "鱿鱼炒饼" : "鸡蛋炒饼") + "，请稍后！");//默认只有1，2两个选项
                break;
            case "2":
                System.out.println("您需要肉丝炒面还是蔬菜烧面（肉丝炒面【1】  蔬菜烧面【2】）");
                int choose2 = sc.nextInt();
                System.out.println("您选择了" + (choose2 == 1 ? "肉丝炒面" : "蔬菜烧面") + "，请稍后！");//默认只有1，2两个选项
                break;
            default:
                System.out.println("谢谢再次光临！");//用户选择放弃用餐
        }
    }
}
