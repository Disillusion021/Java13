package com.coding.day14.集合_List1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T1 {

/*    创建T1类，定义main方法，方法中创建List集合泛型为String，从控制台录入姓名，要求如下
    用户选择添加时，将数据装入集合中，用户选择查询时，查询集合中所有的数据
	"请选择：1. 添加  2. 查询  3. 退出"
            "1"
            "请输入姓名："
            "***"
            "添加成功"
            "请选择：1. 添加  2. 查询  3. 退出"
            "2"
            "所有姓名如下：**  **  **"
            "请选择：1. 添加  2. 查询  3. 退出"
            "3"
            "退出成功！"*/

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择：1. 添加  2. 查询  3. 退出");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("请输入姓名：");
                String name = sc.next();
                list.add(name);
                System.out.println("添加成功");
            } else if (choose == 2) {
                System.out.print("所有姓名如下：");
                System.out.println(list);
            } else if (choose == 3) {
                System.out.println("退出成功");
                return;
            } else {
                System.out.println("输入错误，请重试");
            }
        }
    }
}
