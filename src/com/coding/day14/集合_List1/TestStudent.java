package com.coding.day14.集合_List1;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student(1001, "小明", 19, 56);
        Student s2 = new Student(1002, "小芳", 14, 98);
        Student s3 = new Student(1003, "小强", 21, 67);
        Student s4 = new Student(1004, "小刚", 27, 39);
        Student s5 = new Student(1005, "小王", 17, 92);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        //---------------------------------------------------------------
        //假设：我们只知道集合中装对象，但是不知道具体装几个，对象中也不知道什么信息！
        //完成以下任务：

        //(1). 输出集合中所有学生的姓名
        for (Student s : list) {
            System.out.print(s.getName() + "  ");
        }
        System.out.println();
        //(2). 输出集合中学号为1002的学生姓名和年龄
        for (Student s : list) {
            if (s.getId() == 1002) {
                System.out.println("学号为1002的学生姓名为" + s.getName() + "，年龄为" + s.getAge());
            }
        }
        //(3). 统计集合中成年学生的数量
        int count = 0;
        for (Student s : list) {
            if (s.getAge() >= 18) {
                count++;
            }
        }
        System.out.println(count);
        //(4). 输出集合中所有学生的最高成绩
        double maxScore = list.get(0).getScore();
        for (Student s : list) {
            if (s.getScore() > maxScore) {
                maxScore = s.getScore();
            }
        }
        System.out.println(maxScore);
        //(5). 将集合中学号为1003的学生姓名改为夯大力
        for (Student s : list) {
            if (s.getId() == 1003) {
                s.setName("夯大力");
                System.out.println("学号为" + s.getId() + "的学生姓名已改为" + s.getName());
            }
        }
        //(6). 将集合中学号为1001的学生对象替换为s6对象
        Student s6 = new Student(1006, "小红", 22, 88);
        boolean tag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == 1001) {
                list.set(i, s6);
                System.out.println("替换成功");
                tag = true;
            }
        }
        if (!tag) {
            System.out.println("替换失败");
        }
        //(7). 删除集合中学号为1004的学生对象
        list.removeIf(x -> x.getId() == 1004);
        System.out.println(list);
    }
}









