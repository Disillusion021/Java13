package com.coding.day15.集合综合应用;

public interface TeacherService {
    void addTeacher(Teacher teacher);

    void updateTeacher(int no);

    void deleteTeacher(int no);

    void selectTeacher();

    void selectTeacherByCourse(String course);

    void selectTeacherCount();

    void selectNo();

}
