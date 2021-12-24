package com.coding.day12.抽象类与接口综合应用;

interface IPerson {
    void setName(String perName);

    void setAge(int perAge);

    void setSex(String perSex);

    String getName();

    int getAge();

    String getSex();

    IPerson[] add(IPerson[] iPeople, IPerson iPerson, String perName, int perAge, String perSex);

}
