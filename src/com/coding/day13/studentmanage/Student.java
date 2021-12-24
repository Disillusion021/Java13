package com.coding.day13.studentmanage;

public class Student {
    private String stuName;
    private int stuAge;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public Student[] add(Student[] students, Student student , String stuName, int stuAge) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                student.stuName = stuName;
                student.stuAge = stuAge;
                students[i] = student;
                break;
            }
        }
        return students;
    }
}
