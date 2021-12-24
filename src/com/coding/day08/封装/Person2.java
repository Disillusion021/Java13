package com.coding.day08.封装;

public class Person2 {

    private int age = -1;

    public void setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("输入错误");
        }
    }

    public void getAge() {
        if (age >= 0 && age <= 130) {
            System.out.println("年龄为：" + age);
        }
    }
}
