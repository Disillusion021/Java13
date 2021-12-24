package com.coding.day11.接口;

public interface UserCheck {
    User addUser(int id, int password);

    boolean checkUser(User user, int id, int password);
}
