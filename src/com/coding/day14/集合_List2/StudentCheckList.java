package com.coding.day14.集合_List2;

import java.util.List;

public class StudentCheckList implements StudentCheck {

    @Override
    public void addStudent(Student student) {
        Model.LIST.add(student);
    }

    @Override
    public void deleteStudent(int id) {
        Model.LIST.removeIf(s -> s.getId() == id);
    }

    @Override
    public void updateStudent(int id, Student student) {
        for (int i = 0; i < Model.LIST.size(); i++) {
            if (Model.LIST.get(i).getId() == id) {
                Model.LIST.set(i, student);
            }
        }
    }
}
