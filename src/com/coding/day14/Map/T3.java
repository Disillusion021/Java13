package com.coding.day14.Map;

import java.util.*;

public class T3 {

    /*
    创建T3类，定义main方法，创建Map<Integer, String>集合，键值对信息为"学号--姓名"
    要求：从控制台录入数据完成集合的增删改查的功能：
    “请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出”
    “1”
    “请输入学号：***”(输入学号后，判断学号是否有重复，如果有重复，则提示输入错误)
    “请输入姓名：***”
    “添加成功！”
    “请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出”
    “2”(用户选择修改时，显示map集合中所有的学号，并且根据学号修改姓名)
    “所有学号如下：**** **** ****”
    “请选择要修改的学号：***”
    “请输入修改后的姓名：***”
    “修改成功！”
    “请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出”
    “3”(用户选择删除时，显示map集合中所有的学号)
    “所有学号如下：**** **** ****”
    “请选择要删除的学号：***”
    “删除成功！”
    “请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出”
    “4”(用户选择4时，查询map集合中所有学生姓名)
    “所有姓名如下：**** **** ****”
    “请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出”
    “5”
    “退出成功！”
*/

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("请输入学号：");
                int id = sc.nextInt();
                if (map.containsKey(id)) {
                    System.out.println("学号重复，输入错误");
                    continue;
                } else {
                    System.out.println("请输入姓名：");
                    String name = sc.next();
                    map.put(id, name);
                    System.out.println("添加成功！");
                }
            }
            if (choose == 2) {
                System.out.println("所有学号如下:");
                System.out.println(map.keySet());
                System.out.println("请选择要修改的学号:");
                int id = sc.nextInt();
                System.out.println("请输入修改后的姓名：");
                String name = sc.next();
                map.put(id, name);
                System.out.println("修改成功!");
            }
            if (choose == 3) {
                System.out.println("所有学号如下:");
                System.out.println(map.keySet());
                System.out.println("请选择要删除的学号：");
                int id = sc.nextInt();
                map.remove(id);
                System.out.println("删除成功!");
            }
            if (choose == 4) {
                System.out.println("所有姓名如下：");
                System.out.println(map.values());
            }
            if (choose == 5) {
                System.out.println("退出成功！");
                break;
            }
        }
    }
}
