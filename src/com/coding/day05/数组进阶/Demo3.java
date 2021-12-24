package com.coding.day05.数组进阶;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruit = {"苹果", "香蕉", "梨", "柿子", "桃子", "西瓜", "草莓", "葡萄", "木瓜", "哈密瓜"};
        System.out.println("~~~~现有水果如下：~~~~");
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(i+1 + "." +fruit[i]);
        }
        for (; ;) {
            System.out.println("请输入要选择的水果编号（1-10）：");
            int num = sc.nextInt();
            if (num < 1 || num > 10) {
                System.out.println("选择无效请重新输入");
            } else {
                System.out.println("您选择了" + fruit[num-1]);
                break;
            }
        }

    }
}
