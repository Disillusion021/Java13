package com.coding.day11.抽象类;

public abstract class TeacherChange {
    public abstract Teacher add(String name, int age);

    public abstract Teacher update(Teacher teacher, String name, int age);

    public abstract void showTeacher(Teacher teacher);
}
