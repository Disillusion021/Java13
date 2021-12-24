package com.coding.day08.封装;

import java.util.Scanner;

public class TestPerson2 {

    public static void main(String[] args) {
        Person2 b = new Person2();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        b.setAge(age);
        b.getAge();
    }
}
