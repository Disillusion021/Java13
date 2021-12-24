package com.coding.day08.封装;

public class TestPerson {

    public static void main(String[] args) {
        Person a = new Person();
        a.setAge(18);
        a.setHeight(50);
        System.out.println(a.getAge());
        System.out.println(a.getHeight());
    }
}
