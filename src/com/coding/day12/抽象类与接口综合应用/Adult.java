package com.coding.day12.抽象类与接口综合应用;

public class Adult extends Add implements IPerson {
    private String adtName;
    private int adtAge;
    private String adtSex;


    @Override
    public void setName(String perName) {
        this.adtName = perName;
    }

    @Override
    public void setAge(int perAge) {
        this.adtAge = perAge;
    }

    @Override
    public void setSex(String perSex) {
        this.adtSex = perSex;
    }

    @Override
    public String getName() {
        return adtName;
    }

    @Override
    public int getAge() {
        return adtAge;
    }

    @Override
    public String getSex() {
        return adtSex;
    }
}
