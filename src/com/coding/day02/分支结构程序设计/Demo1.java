package com.coding.day02.分支结构程序设计;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入性别");
        System.out.println("提示：男 or 女");
        String sex = sc.next();
        System.out.println( sex.equals("女") ? "欢迎女士光临本休闲小店" : (sex .equals("男") ? "欢迎先生光临本休闲小店" : "您输入的性别无效，无法光临本店" ));
    }
}
