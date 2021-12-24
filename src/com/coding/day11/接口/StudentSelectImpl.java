package com.coding.day11.接口;

public class StudentSelectImpl implements StudentSelect{
    @Override
    public void selectStudent(Student student) {
        String profession;
        if (student.getProfession() == 1) {
            profession = "土木";
        } else if (student.getProfession() == 2) {
            profession = "软件";
        } else if (student.getProfession() == 3) {
            profession = "机械";
        } else {
            profession = "其他";
        }
        System.out.println(student.getName() + "学号是" + student.getNo() + "，他的专业是" + profession + "，这次考试他考了" + student.getScore() + "分");
    }
}
