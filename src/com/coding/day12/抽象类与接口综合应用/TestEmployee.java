package com.coding.day12.抽象类与接口综合应用;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programmer p1 = new Programmer(1, "小云", 5000, 50);
        Programmer p2 = new Programmer();
        System.out.println("请输入id：");
        p2.setId(sc.nextInt());
        System.out.println("请输入姓名：");
        p2.setName(sc.next());
        System.out.println("请输入工资：");
        p2.setSalary(sc.nextDouble());
        System.out.println("请输入bug数：");
        p2.setBugCount(sc.nextInt());
        p1.show();
        p1.work();
        p2.show();
        p2.work();

        Manager m1 = new Manager(1, "经理1", 5000, 50);
        Manager m2 = new Manager();
        System.out.println("请输入id：");
        m2.setId(sc.nextInt());
        System.out.println("请输入姓名：");
        m2.setName(sc.next());
        System.out.println("请输入工资：");
        m2.setSalary(sc.nextDouble());
        System.out.println("请输入奖金：");
        m2.setBonus(sc.nextDouble());
        m1.show();
        m1.work();
        m2.show();
        m2.work();
        m1.adjustSalary(p1);
        m2.adjustSalary(p2);

        Employee e1 = new Programmer(11, "小王", 8000, 0);
        Employee e2 = new Manager(12,"小张", 12000,8000);
        e1.work();
        e2.work();
        if (e1.getSalary() > e2.getSalary()) {
            System.out.println("程序员" + e1.getName() + "比经理" + e2.getName() + "的工资高");
        } else {
            System.out.println("经理" + e2.getName() + "比程序员" + e1.getName() + "的工资高");
        }
    }
}
