package com.coding.day09.面向对象综合练习_封装_继承;

public class Customer {
    private String customerName;
    private String customerSex;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public Customer() {
        customerName = "新顾客" + (int) (Math.random() * 10) + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        customerSex = "男";
    }

    public void buy(Mobile m) {
        if (m.getMobileSize().equals("5.5寸") && m.getMobilePrize() <= 2000) {
            System.out.println("<" + customerSex + ">顾客<" + customerName + ">购买了一个5.5寸屏的" + m.getMobileName() + "手机，价格" + m.getMobilePrize() + "元");
        } else {
            System.out.println("<" + customerSex + ">顾客<" + customerName + ">没有购买任何手机");
        }
    }
}
