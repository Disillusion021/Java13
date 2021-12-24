package com.coding.day09.继承进阶;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        NetGame n = new NetGame("FF14", "角色扮演", 2000000, "莫古力");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入服务器名：");
        String server = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        if (n.login(server, password)) {
            n.loadMap();
            System.out.println("进行到目前为止，还剩余" + n.game() + "个玩家");
        } else {
            System.out.println("登录失败，无法玩游戏");
        }
    }
}
