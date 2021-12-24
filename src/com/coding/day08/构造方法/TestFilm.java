package com.coding.day08.构造方法;

public class TestFilm {
    public static void main(String[] args) {
        Film f1 = new Film();
        f1.addMoney(5);
        f1.showFilm();
        Film f2 = new Film("这个手刹不太灵", "小强", 0);
        f2.addMoney(10);
        f2.showFilm();
    }
}
