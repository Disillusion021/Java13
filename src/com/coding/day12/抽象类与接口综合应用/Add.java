package com.coding.day12.抽象类与接口综合应用;

public class Add {
    public IPerson[] add(IPerson[] iPeople, IPerson iPerson, String perName, int perAge, String perSex) {
        iPerson.setName(perName);
        iPerson.setAge(perAge);
        iPerson.setSex(perSex);
        for (int i = 0; i < iPeople.length; i++) {
            if (iPeople[i] == null) {
                iPeople[i] = iPerson;
                break;
            }
        }
        return iPeople;
    }
}
