package com.coding.day08.方法重载;

public class Person {

    int height;
    String character;

    public void f1(int h) {
        height = h;
        System.out.println("此人身高为" + height);
    }
    public void f1(String c) {
        character = c;
        System.out.println("此人性格为" + character);
    }
    public void f1(int h1, String c1) {
        height = h1;
        character = c1;
        System.out.println("此人身高为" + height + "，此人性格为" + character);
    }

    public static void main(String[] args) {
        Person x = new Person();
        x.f1(200);
        x.f1("英勇无畏");
        x.f1(200,"英勇无畏");
    }
}
