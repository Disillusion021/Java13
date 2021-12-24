package com.coding.day15.集合综合应用;

public class TeacherAndStudentServiceImpl implements TeacherAndStudentService{
    @Override
    public void selectStudentAndTeacher(int classNo) {
        System.out.print("学生姓名为：");
        for (Student s : Model.LIST) {
            if (s.getClassNo() == classNo) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
        System.out.print("老师姓名为：");
        for (Teacher t : Model.MAP.values()) {
            if (t.getClassNo() == classNo) {
                System.out.print(t + " ");
            }
        }
        System.out.println();
    }
}
