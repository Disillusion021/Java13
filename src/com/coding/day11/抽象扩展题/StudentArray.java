package com.coding.day11.抽象扩展题;

public class StudentArray extends ChangeStudent {
    Student[] students = new Student[10];

    @Override
    public Student creatStudent(int no, String name, int age) {
        Student student = new Student();
        student.setNo(no);
        student.setName(name);
        student.setAge(age);
        return student;
    }

    @Override
    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("添加成功");
                return;
            }
        }
        System.out.println("班级已满，添加失败");
    }

    @Override
    public void updateStudent(int no, String name, int age) {
        for (int i = 0; i < students.length; i++) {
            if (students[i]!= null && students[i].getNo() == no) {
                students[i].setName(name);
                students[i].setNo(no);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("修改失败");
    }

    @Override
    public void showStudent() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("学生" + (i + 1) + "，姓名为" + students[i].getName() + "，年龄为" + students[i].getAge() + "岁" + "，学号：" + students[i].getNo());
            }
        }
    }
}
