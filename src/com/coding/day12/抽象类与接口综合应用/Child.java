package com.coding.day12.抽象类与接口综合应用;

public class Child extends Add implements IPerson {
    private String chdName;
    private int chdAge;
    private String chdSex;


    @Override
    public void setName(String perName) {
        this.chdName = perName;
    }

    @Override
    public void setAge(int perAge) {
        this.chdAge = perAge;
    }

    @Override
    public void setSex(String perSex) {
        this.chdSex = perSex;
    }

    @Override
    public String getName() {
        return chdName;
    }

    @Override
    public int getAge() {
        return chdAge;
    }

    @Override
    public String getSex() {
        return chdSex;
    }
}
