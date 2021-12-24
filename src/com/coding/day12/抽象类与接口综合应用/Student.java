package com.coding.day12.抽象类与接口综合应用;

public class Student extends Add implements IPerson {
    private String stuName;
    private int stuAge;
    private String stuSex;


    @Override
    public void setName(String perName) {
        this.stuName = perName;
    }

    @Override
    public void setAge(int perAge) {
        this.stuAge = perAge;
    }

    @Override
    public void setSex(String perSex) {
        this.stuSex = perSex;
    }

    @Override
    public String getName() {
        return stuName;
    }

    @Override
    public int getAge() {
        return stuAge;
    }

    @Override
    public String getSex() {
        return stuSex;
    }
}
