package com.coding.day14.Map;

import java.util.Map;

public class StudentTest1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setId(1001);
        s2.setId(1002);
        s3.setId(1003);
        s1.setName("小利");
        s2.setName("小君");
        s3.setName("小兰");
        StudentCheckMap m = new StudentCheckMap();
        m.addStudent(s1);
        m.addStudent(s2);
        m.addStudent(s3);
        Student s4 = new Student();
        s4.setId(1004);
        s4.setName("小智");
        m.updateStudent(1002, s4);
        m.deleteStudent(1003);
        System.out.println(Model.MAP);
    }
}
