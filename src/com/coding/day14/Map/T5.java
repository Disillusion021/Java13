package com.coding.day14.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        while (true) {
            System.out.println("请选择：1-添加通讯录信息  2-通过姓名查找号码  3-退出");
            int tag = sc.nextInt();
            if (tag == 1) {
                while (true) {
                    System.out.println("请输入姓名：");
                    String name = sc.next();
                    System.out.println("请输入电话：");
                    String num = sc.next();
                    map.put(name, num);
                    System.out.println("是否继续？【Y】- 继续 【其他】- 退出");
                    String choose = sc.next();
                    if (!choose.equals("Y")) {
                        break;
                    }
                }
            }

            if (tag == 2) {
                System.out.println("请输入要查找的姓名：");
                String name1 = sc.next();
                if (map.containsKey(name1)) {
                    System.out.println(name1 + "的电话是" + map.get(name1));
                } else {
                    System.out.println("此人不存在");
                }
            }

            if (tag == 3) {
                break;
            }

        }

    }
}
