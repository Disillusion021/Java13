package com.coding.Test.Son;

public class Test2 {
    // 父类属性私有化，子类通过通过父类公有方法获取父类私有属性
    public static void main(String[] args) {
        Son2 son = new Son2();
        System.out.println(son.giveBook());
    }
}
