package com.coding.Test;

public class Student {
    int id;
    String name;
    int age;
    Computer comp;

    void study() {
        System.out.println("我再认真学习!!使用电脑：" + comp.brand);
    }

    void play() {
        System.out.println("我在玩游戏！王者农药！");
    }

    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu);
        System.out.println(Integer.toHexString(System.identityHashCode(stu)));
        stu.id = 1001;
        stu.name = "小王";
        System.out.println(Integer.toHexString(System.identityHashCode("小王")));
        System.out.println(Integer.toHexString(System.identityHashCode(stu.name)));
        stu.age = 18;
        Computer c1 = new Computer();
        System.out.println(c1);
        System.out.println(Integer.toHexString(System.identityHashCode(c1)));
        c1.brand = "戴尔";
        System.out.println(Integer.toHexString(System.identityHashCode("戴尔")));
        System.out.println(Integer.toHexString(System.identityHashCode(c1.brand)));
        stu.comp = c1;
        System.out.println(Integer.toHexString(System.identityHashCode(stu.comp)));

        stu.play();
        //创建了一个新对象保存在堆中，虽然没有引用变量引用它
        System.out.println(Integer.toHexString(System.identityHashCode("我再认真学习!!使用电脑：" + stu.comp.brand)));
        //下面两条语句是一样的，都是在方法区里的常量池进行操作
        System.out.println(Integer.toHexString(System.identityHashCode("我再认真学习!!使用电脑：" + "戴尔")));
        System.out.println(Integer.toHexString(System.identityHashCode("我再认真学习!!使用电脑：戴尔")));
        //不论如何引用拼接，只要字符串相同,hashcode相同,因为hashcode被String类型重写过
        System.out.println(("我再认真学习!!使用电脑：" + stu.comp.brand).hashCode());
        System.out.println(("我再认真学习!!使用电脑：" + "戴尔").hashCode());
        System.out.println(("我再认真学习!!使用电脑：戴尔").hashCode());
        stu.study();
    }
}

class Computer {
    String brand;
}
