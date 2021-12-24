package com.coding.day12.常用类;

public class Demo18 {
    public static void main(String[] args) {
        String s1 = "姓名：小明，年龄：19岁";
        String s2 = "姓名：夯大力，年龄：21岁";
        String s3 = "姓名：欧阳小强，年龄：23岁";
        m(s1);
        m(s2);
        m(s3);
    }

    public static void m(String s) {
        String[] arr = s.split("，");
        String name = arr[0].substring(3, arr[0].length());
        String age = arr[1].substring(3, arr[1].length());
        System.out.println(name + "，" + age);
    }
}
