package com.coding.day11.抽象扩展题;

public abstract class ChangeStudent {
    public abstract Student creatStudent(int no, String name, int age);

    public abstract void addStudent(Student student);

    public abstract void updateStudent(int no, String name, int age);

    public abstract void showStudent();
}
