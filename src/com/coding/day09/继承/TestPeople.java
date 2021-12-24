package com.coding.day09.继承;

public class TestPeople {
    public static void main(String[] args) {
        Student a = new Student();
        Worker b = new Worker();
        a.name = "小张";
        a.age = 8;
        a.grade = 3;
        a.score = 98;
        b.name = "小李";
        b.age = 28;
        b.company = "设计";
        b.salary = 9800;
        a.showStudent();
        a.ability();
        b.showStudent();
        b.ability();
    }
}
