package com.coding.day11.接口;

public class SelectUserImpl implements SelectUser{
    @Override
    public void selectCustomer(Customer c1) {
        System.out.println("用户为普通用户，账户名" + c1.no + "，当前积分" + c1.password + "分");
    }

    @Override
    public void selectVip(Vip v1) {
        System.out.println("用户为会员用户，账户名" + v1.no + "，当前积分" + v1.password + "分");
    }
}
