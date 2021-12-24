package com.coding.day08.封装;

public class TestStudent {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setNo(1001);
        student1.setName("小红");
        student1.setScore(96);
        student2.setNo(1002);
        student2.setName("小明");
        student2.setScore(88);
        System.out.println(student1.getName() + "的学号是" + student1.getNo() + "，他的java成绩是" + student1.getScore() + "分");
        System.out.println(student2.getName() + "的学号是" + student2.getNo() + "，他的java成绩是" + student2.getScore() + "分");
    }
}
