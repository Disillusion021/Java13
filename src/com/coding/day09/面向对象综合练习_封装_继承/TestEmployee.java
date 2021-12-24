package com.coding.day09.面向对象综合练习_封装_继承;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee a = new Employee();
        Employee b = new Employee();
        Employee c = new Employee();
        System.out.print("请输入第1个员工的名字：");
        a.setName(sc.next());
        System.out.print("请输入第1个员工的年龄：");
        a.setAge(sc.nextInt());
        System.out.print("请输入第1个员工的职位：");
        a.setPosition(sc.next());
        System.out.print("请输入第1个员工的薪资：");
        a.setSalary(sc.nextDouble());
        System.out.print("请输入第2个员工的名字：");
        b.setName(sc.next());
        System.out.print("请输入第2个员工的年龄：");
        b.setAge(sc.nextInt());
        System.out.print("请输入第2个员工的职位：");
        b.setPosition(sc.next());
        System.out.print("请输入第2个员工的薪资：");
        b.setSalary(sc.nextDouble());
        System.out.print("请输入第3个员工的名字：");
        c.setName(sc.next());
        System.out.print("请输入第3个员工的年龄：");
        c.setAge(sc.nextInt());
        System.out.print("请输入第3个员工的职位：");
        c.setPosition(sc.next());
        System.out.print("请输入第3个员工的薪资：");
        c.setSalary(sc.nextDouble());
        System.out.println("名字" + "\t\t" + "年龄" + "\t\t" + "职位" + "\t\t\t" + "薪资");
        a.showEmployee();
        b.showEmployee();
        c.showEmployee();
    }
}
