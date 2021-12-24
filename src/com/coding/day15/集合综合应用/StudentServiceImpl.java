package com.coding.day15.集合综合应用;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentServiceImpl implements StudentService{
    Scanner sc = new Scanner(System.in);
    @Override
    public void addStudent(Student student) {
        Model.LIST.add(student);
    }

    @Override
    public void updateStudent(int no) {
        for (Student s : Model.LIST) {
            if (s.getNo() == no) {
                System.out.println("请输入学生姓名：");
                s.setName(sc.next());
                System.out.println("请输入学生班级：");
                s.setClassNo(sc.nextInt());
                System.out.println("请输入学生分数：");
                s.setScore(sc.nextInt());
            }
        }
    }

    @Override
    public void deleteStudent(int no) {
        for (int i = 0; i < Model.LIST.size(); i++) {
            if (Model.LIST.get(i).getNo() == no) {
                Model.LIST.remove(i);
            }
        }

    }

    @Override
    public void selectStudent() {
        System.out.println(Model.LIST);
    }

    @Override
    public void selectMaxScore(int classNo) {
        int max = 0;
        for (Student s : Model.LIST) {
            if (s.getClassNo() == classNo && s.getScore() > max) {
                max = s.getScore();
                System.out.println(classNo + "班" + "的最高成绩为：" + s.getScore());
            }
        }

    }

    @Override
    public void selectStudentCount() {
        System.out.println("学生总数为：" + Model.LIST.size());
    }

    @Override
    public void selectNo() {
        Set<Integer> set = new HashSet<>();
        for (Student s : Model.LIST) {
            set.add(s.getNo());
            System.out.println(set);
        }
    }

    @Override
    public void selectClass() {
        Set<Integer> set = new HashSet<>();
        for (Student s : Model.LIST) {
            set.add(s.getClassNo());
        }
        System.out.println(set);
    }
}
