package com.coding.day13.studentmanage;

public class RegisterAndLogin {
    private String username;
    private String password;
    private String email;
    private int age;

    public boolean register(String username, String password, String confirmPassword, String email, int age) {
        char[] chars = username.toCharArray();
        if (!(((int) chars[0] >= 65 && (int) chars[0] <= 90) || ((int) chars[0] >= 97 && (int) chars[0] <= 122))) {
            System.out.println("用户名开头非英文字母");
            return false;
        }
        for (char c : chars) {
            if (!(((int) c >= 65 && (int) c <= 90) || ((int) c >= 97 && (int) c <= 122) || ((int) c >= 48 && (int) c <= 57))) {
                System.out.println("用户名含非法字符");
                return false;
            }
        }
        if (password.length() < 8 || password.length() > 16) {
            System.out.println("密码长度不符");
            return false;
        }
        if (!confirmPassword.equals(password)) {
            System.out.println("两次输入密码不一致");
            return false;
        }
        if (email.indexOf('@') == -1 || email.indexOf('.') == -1 || email.indexOf('.') >= email.indexOf('@')) {
            System.out.println("邮箱格式不正确");
            return false;
        }
        if (age < 18 || age > 60) {
            System.out.println("年龄不符");
            return false;
        }
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        return true;
    }

    public boolean login(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }
}
