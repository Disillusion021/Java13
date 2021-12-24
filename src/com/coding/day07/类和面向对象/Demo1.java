package com.coding.day07.类和面向对象;

public class Demo1 {

    public static void main(String[] args) {
        Student xiaoFang = new Student();
        xiaoFang.name = "小芳";
        System.out.println(new Student().name);
        System.out.println(xiaoFang.age);
        System.out.println(xiaoFang.name);
        new Student().show();
        xiaoFang.show();
    }
}
