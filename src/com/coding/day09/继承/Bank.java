package com.coding.day09.继承;

public class Bank {
    double money;
    String userName;
    String password;

    public boolean saveMoney(double money) {
        return false;
    }

    public boolean getMoney(double money) {
        return false;
    }

    public boolean createAccount(String userName, String password, String confirmPassword) {
        if (confirmPassword.equals(password)) {
            this.userName = userName;
            this.password = password;
            return true;
        } else {
            return false;
        }
    }

    public boolean updatePassword(String userName, String password, String newPassword) {
        if (userName.equals(this.userName) && password.equals(this.password)) {
            this.password = newPassword;
            return true;
        } else {
            return false;
        }
    }

    public boolean login(String userName, String password) {
        if (userName.equals(this.userName) && password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }

    public void showMoney() {
        System.out.println("您当前账户余额为：" + money + "元");
    }
}
