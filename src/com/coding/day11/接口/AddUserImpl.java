package com.coding.day11.接口;

public class AddUserImpl implements AddUser {
    @Override
    public Customer addCustomer(Customer c1, int no, int password, int cusScore) {
        c1.no = no;
        c1.password = password;
        c1.cusScore = cusScore;
        return c1;
    }

    @Override
    public Vip addVip(Vip v1, int no, int password, int vipScore) {
        v1.no = no;
        v1.password = password;
        v1.vipScore = vipScore;
        return v1;
    }
}
