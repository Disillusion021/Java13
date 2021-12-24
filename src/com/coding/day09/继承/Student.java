package com.coding.day09.继承;

public class Student extends People {
    String name;
    int score;
    int grade;

    @Override
    public void ability() {
        System.out.println("我会写作业，我会加减乘除。");
    }

    public void showStudent() {
        System.out.print(name + "这名学生的年龄是" + age + "岁，今年" + grade + "年级，期末分数" + score + "分。");
    }
}
