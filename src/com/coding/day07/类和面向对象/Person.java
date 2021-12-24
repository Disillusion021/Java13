package com.coding.day07.类和面向对象;

public class Person {

    String name;
    int age;
    String sex;

    public void changeName(String n) {
        name = n;
    }

    public void addAge(int n) {
        age = n;
    }

    public void showPerson() {
        System.out.println("此人姓名为" + name + "，年龄" + age + "岁，性别" + sex);
    }
}
