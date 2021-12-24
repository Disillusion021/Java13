package com.coding.day08.构造方法;

public class TestPeople {
    public static void main(String[] args) {
        People x = new People();
        x.changeName("小明");
        x.talk("受死吧");
        x.addHeight(23);
        x.showPeople();
    }
}
