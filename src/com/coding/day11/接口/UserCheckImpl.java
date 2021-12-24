package com.coding.day11.接口;

public class UserCheckImpl implements UserCheck{
    @Override
    public User addUser(int id, int password) {
        User user = new User();
        user.setId(id);
        user.setPassword(password);
        return user;
    }

    @Override
    public boolean checkUser(User user, int id, int password) {
        if (user.getId() == id && user.getPassword() == password) {
            return true;
        } else {
            return false;
        }
    }
}
