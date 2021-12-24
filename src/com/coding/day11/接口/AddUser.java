package com.coding.day11.接口;

public interface AddUser {
    Customer addCustomer(Customer c1, int no, int password, int cusScore);

    Vip addVip(Vip v1, int no, int password, int vipScore);
}
