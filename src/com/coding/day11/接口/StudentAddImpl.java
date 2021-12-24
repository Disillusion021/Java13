package com.coding.day11.接口;

public class StudentAddImpl implements StudentAdd {
    @Override
    public Student addStudent(int no, String name, int profession, double score) {
        Student student = new Student();
        student.setNo(no);
        student.setName(name);
        student.setProfession(profession);
        student.setScore(score);
        return student;
    }
}
