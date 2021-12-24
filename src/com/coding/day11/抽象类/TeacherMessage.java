package com.coding.day11.抽象类;

public class TeacherMessage extends TeacherChange{
    @Override
    public Teacher add(String name, int age) {
        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setAge(age);
        return teacher;
    }

    @Override
    public Teacher update(Teacher teacher, String name, int age) {
        teacher.setName(name);
        teacher.setAge(age);
        return teacher;
    }

    @Override
    public void showTeacher(Teacher teacher) {
        System.out.println(teacher.getName() + "年龄为" + teacher.getAge() + "岁");
    }
}
