package com.coding.day14.集合_List1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T4 {

/*
    创建T4类，定义main方法，创建List集合，泛型String，通过从控制台录入数据，完成集合中数据的增删改查功能
	“请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出”
            “1”
            “请输入数据：”
            “***”
            “添加成功！”
            “请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出”
            “2”(用户选择修改时，先将集合中的数据查询出来)
            “现有数据如下：** ** ** ** **”
            “请输入要修改的数据值：”
            “***”(如果输入的数据不是集合中已有的数据，提示输入错误，请重新输入)
            “请输入修改后的数据值：”
            “***”
            “修改成功！”
            “请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出”
            “3”(用户选择删除时，先将集合中的数据查询出来)
            “现有数据如下：** ** ** ** **”
            “请输入要删除的数据：”(如果输入的数据不是集合中已有的数据，提示输入错误，请重新输入)
            “**”
            “删除成功！”
            “请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出”
            “4”
            “现有数据如下：** ** ** ** **”
            “请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出”
            “5”
            “退出成功！”
*/

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("请输入数据：");
                list.add(sc.next());
                System.out.println("添加成功");
            } else if (choose == 2) {
                System.out.println("现有数据如下：" + list);
                System.out.println("请输入要修改的数据值：");
                String x = sc.next();
                while (true) {
                    if (list.contains(x)) {
                        System.out.println("请输入修改后的数据值：");
                        list.set(list.indexOf(x),sc.next());
                        System.out.println("修改成功");
                        break;
                    } else {
                        System.out.println("输入错误，请重新输入");
                    }
                }
            } else if (choose == 3) {
                System.out.println("现有数据如下：" + list);
                System.out.println("请输入要删除的数据值：");
                String x = sc.next();
                while (true) {
                    if (list.contains(x)) {
                        list.remove(x);
                        System.out.println("删除成功");
                        break;
                    } else {
                        System.out.println("输入错误，请重新输入");
                    }
                }
            } else if (choose == 4) {
                System.out.println("现有数据如下：" + list);
            } else if (choose == 5) {
                System.out.println("退出成功！");
                return;
            } else {
                System.out.println("输入错误，请重试");
            }
        }

    }
}
