package com.coding.day14.集合_List2;

public class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student() {
    }
        public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
