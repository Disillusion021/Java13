package com.coding.day08.构造方法;

public class People {
    String name;
    int age;
    String sex;
    double height;

    public People() {
        name = "小强";
        age = 24;
        sex = "男";
        height = 160;
    }

    public void talk(String t) {
        System.out.println(name + "说了一句" + t);
    }

    public void changeName(String n) {
        name = n;
    }

    public void addHeight(double h) {
        height += h;
    }

    public void showPeople() {
        if (height > 180) {
            System.out.println("他，身高" + height + "有余，孔武有力，年仅" + age + "岁，就以傲人的身高俯瞰众生，他就是" + name);
        } else {
            System.out.println("他，虽身高仅有" + height + "，却有着惊人的速度和灵活性，年仅" + age + "岁，就能快速游走于公交人群中，他就是" + name);
        }
    }
}
