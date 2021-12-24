package com.coding.day11.抽象类;

public class StudentTest {
    public static void main(String[] args) {
        CreatStudent creatStudent = new CreatStudentMessage();
        Student s = creatStudent.creat(23, "小王", 100);
        System.out.println(s.name + "的学号为" + s.no + "，他的Java成绩为" + s.score);
    }
}
