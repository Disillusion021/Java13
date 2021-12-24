package com.coding.day12.抽象类与接口综合应用;

public class User {
    private String username;
    private String password;

    public User() {
        username = "admin";
        password = "000000";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean reg(String username, String password, String confirmPassword) {
        if (username.length() > 6 && confirmPassword.equals(password) && password.length() >= 6 && password.length() <= 14) {
            this.username = username;
            this.password = password;
            return true;
        } else {
            return false;
        }
    }

    public boolean login(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }
}
