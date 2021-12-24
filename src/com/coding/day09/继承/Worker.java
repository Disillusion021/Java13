package com.coding.day09.继承;

public class Worker extends People {
    String name;
    int salary;
    String company;

    @Override
    public void ability() {
        System.out.println("我会设计图纸，我能够盖大楼。");
    }

    public void showStudent() {
        System.out.print(name + "这名工人的年龄是" + age + "岁，在" + company + "公司，工资是" + salary + "元。");
    }
}
