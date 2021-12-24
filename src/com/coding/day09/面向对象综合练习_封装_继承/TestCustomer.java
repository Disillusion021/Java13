package com.coding.day09.面向对象综合练习_封装_继承;

import java.util.Scanner;

public class TestCustomer {
    public static void main(String[] args) {
        Customer c = new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.println("当前购买的顾客默认信息：");
        System.out.println(" 姓名：" + c.getCustomerName());
        System.out.println(" 性别：" + c.getCustomerSex());
        System.out.println("是否实名购买商品？【y-实名，其他-匿名】");
        String choose = sc.next();
        if (choose.equals("y")) {
            System.out.println("请输入顾客姓名：");
            c.setCustomerName(sc.next());
            System.out.println("请输入顾客性别：");
            c.setCustomerSex(sc.next());
        }
        Mobile m = new Mobile("vivo2000", "5.5寸", 1799.9);
        c.buy(m);
    }
}
