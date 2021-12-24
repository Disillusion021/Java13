package com.coding.day12.常用类;

import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号");
        String id = sc.next();
        if (id.length() == 18) {
            System.out.println("生日为" + id.substring(6, 14));
            int sex = Integer.parseInt(id.substring(17));
            System.out.println("性别为" + (sex % 2 == 0 ? "女" : "男"));
        } else {
            System.out.println("不符合要求");
        }
    }
}