package com.coding.day11.抽象类;

import java.util.Scanner;

public class PeopleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String id = sc.next();
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入身高：");
        int height = sc.nextInt();
        CreatPeople creatPeople = new CreatPeopleMessage();
        People x = creatPeople.creat(id, name, height);
        System.out.println("创建成功，" + x.getName() + "的身份证号为" + x.getId() + "，他的身高是" + x.getHeight() + (x.getHeight() >= 180 ? "，虎背熊腰" : "，一切正常"));
    }
}
