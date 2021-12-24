package com.coding.day16;

public class Operator {
    public static void register(String username, String password, String password2) throws UserException {
        char[] chars = username.toCharArray();
        for (char c : chars) {
            if (!(Character.isLetter(c) || Character.isDigit(c))) {
                throw new UserException("用户名包含非法字符！！！");
            }
        }
        if (!Character.isLetter(chars[0])) {
            throw new UserException("用户名必须以英文字母开头！！！");
        }
        if (!password.equals(password2)) {
            throw new UserException("两次输入密码不一致!!!");
        }
        System.out.println("注册成功");
    }
}
