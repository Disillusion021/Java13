package com.coding.day15.集合综合应用;

import java.util.Scanner;

public class TeacherServiceImpl implements TeacherService {

    Scanner sc = new Scanner(System.in);

    @Override
    public void addTeacher(Teacher teacher) {
        Model.MAP.put(teacher.getNo(), teacher);
    }

    @Override
    public void updateTeacher(int no) {
        Teacher t = new Teacher();
        System.out.println("请输入老师姓名：");
        t.setName(sc.next());
        System.out.println("请输入老师班级：");
        t.setClassNo(sc.nextInt());
        System.out.println("请输入老师课程：");
        t.setCourse(sc.next());
        Model.MAP.put(no, t);
    }

    @Override
    public void deleteTeacher(int no) {
        Model.MAP.remove(no);
    }

    @Override
    public void selectTeacher() {
        System.out.println(Model.MAP.values());
    }

    @Override
    public void selectTeacherByCourse(String course) {
        for (Teacher t : Model.MAP.values()) {
            if (t.getCourse().equals(course)) {
                System.out.print(t.getName() + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void selectTeacherCount() {
        System.out.println("老师数量为：" + Model.MAP.size());
    }

    @Override
    public void selectNo() {
        System.out.println(Model.MAP.keySet());
    }
}
