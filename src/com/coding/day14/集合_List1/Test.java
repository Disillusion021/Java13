package com.coding.day14.集合_List1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
/*
    创建一个Employee类，包含属性empName、empAge、empSex，包含带参数构造方法，通过参数给属性赋值
    创建一个Test类，定义main()方法，在该方法中创建一个List对象，使用ArrayList类进行实例化
            (1).循环接受用户从键盘输入员工的名字、年龄、性别，根据用户输入的信息创建Employee对象，并添加到集合中，每次输入结束，提问用户是否继续，直到用户不再继续则停止循环
            (2).以循环的方式显示集合中所有员工的信息
            (3).通过键盘输入一个员工的姓名，查找该员工是否存在
*/

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("请输入员工名：");
            String name = sc.next();
            System.out.println("请输入员工年龄：");
            int age = sc.nextInt();
            System.out.println("请输入员工性别：");
            String sex = sc.next();
            Employee e = new Employee(name,age,sex);
            list.add(e);
            System.out.println("是否继续（【y】- 继续输入，【其他】-停止输入）");
        } while (sc.next().equals("y"));

        for (Employee e : list) {
            System.out.println("姓名" + e.empName + "，\t年龄" + e.empAge + "，\t性别" + e.empSex);
        }

        System.out.println("请输入员工姓名：");
        String name = sc.next();
        for (Employee e : list) {
            if (e.empName.equals(name)) {
                System.out.println("该员工存在");
                return;
            }
        }
        System.out.println("该员工不存在");
    }
}
