package com.coding.day09.面向对象综合练习_封装_继承;

public class BankCard extends Card {
    private String validateDate;

    public String getValidateDate() {
        return validateDate;
    }

    public void setValidateDate(String validateDate) {
        this.validateDate = validateDate;
    }

    public BankCard(String company, String validateDate) {
        super();
        setCompany(company);
        this.validateDate = validateDate;
    }
}

