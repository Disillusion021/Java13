package com.coding.day15.集合综合应用;

public class Student {
    private int no;
    private String name;
    private int classNo;
    private int score;

    public Student() {
    }

    public Student(int no, String name, int classNo, int score) {
        this.no = no;
        this.name = name;
        this.classNo = classNo;
        this.score = score;
    }

    @Override
    public String toString() {
        return "学号为：" + no +
                "，姓名为：" + name +
                "，班级为：" + classNo +
                "，成绩为：" + score;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
