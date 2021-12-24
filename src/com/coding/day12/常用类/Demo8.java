package com.coding.day12.常用类;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        String s = "我爱你中国";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s2 = sc.next();
        if (s.endsWith(s2)) {
            System.out.println("是后缀");
        } else {
            System.out.println("不是后缀");
        }
    }
}
