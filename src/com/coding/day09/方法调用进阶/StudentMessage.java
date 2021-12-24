package com.coding.day09.方法调用进阶;

public class StudentMessage {
    public void showStudent(Student s1) {
        System.out.println("姓名为：" + s1.name + "，年龄为：" + s1.age);
    }

    public static void main(String[] args) {
        new StudentMessage().showStudent(new Student());
    }
}

