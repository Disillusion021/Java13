package com.coding.day14.Map;

import java.util.Map;

public class StudentCheckMap implements StudentCheck{
    @Override
    public void addStudent(Student student) {
        Model.MAP.put(student.getId(), student);
    }

    @Override
    public void deleteStudent(int id) {
        Model.MAP.remove(id);

    }

    @Override
    public void updateStudent(int id, Student student) {
        Model.MAP.remove(id);
        Model.MAP.put(student.getId(),student);

    }
}
