package com.coding.day08.构造方法;

public class Student {
    int no;
    int age;
    String name;

    public Student(int no, int age, String name) {
        this.no = no;
        this.age = age;
        this.name = name;
    }

    public void showStudent() {
        System.out.println("这个学生名字叫做" + name + "，学号为" + no + "，年龄为" + age);
    }
}
