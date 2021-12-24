package com.coding.day15.集合综合应用;

public class Teacher {
    private int classNo;
    private int no;
    private String name;
    private String course;

    public Teacher() {

    }

    public Teacher(int classNo, int no, String name, String course) {
        this.classNo = classNo;
        this.no = no;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "工号为：" + no +
                "，姓名为：" + name +
                "，班级为：" + classNo +
                "，主讲科目为：" + course;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
