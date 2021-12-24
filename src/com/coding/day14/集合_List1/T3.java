package com.coding.day14.集合_List1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T3 {

/*
    创建T3类，定义main方法，创建List集合，泛型String，手动向集合中添加5个字符串，从控制台录入数据，验证录入的数据在集合中是否存在，如果存在，则输出“存在”，否则输出“不存在”
            “请输入一个字符串：”
            “***”
            “存在！”
*/

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String x = sc.next();
        if (list.contains(x)) {
            System.out.println("存在");
        } else {
            System.out.println("不存在");
        }
    }
}
