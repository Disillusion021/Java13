package com.coding.IOStream;

import java.io.Serializable;
import java.util.List;

public class Character implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String role;
    private List<String> weapons;

    public Character(String name, String role, List<String> weapons) {
        this.name = name;
        this.role = role;
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Character [name=" + name + ", role=" + role + ", weapons=" + weapons + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<String> weapons) {
        this.weapons = weapons;
    }

}
