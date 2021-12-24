package com.coding.day11.抽象类;

public class CreatStudentMessage extends CreatStudent {

    @Override
    public Student creat(int no, String name, int score) {
        Student student = new Student();
        student.no = no;
        student.name = name;
        student.score = score;
        return student;
    }
}
