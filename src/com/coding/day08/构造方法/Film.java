package com.coding.day08.构造方法;

public class Film {
    String filmName;
    String actorName;
    int money;


    public Film() {
    }

    public Film(String filmName, String actorName, int money) {
        this.filmName = filmName;
        this.actorName = actorName;
        this.money = money;
    }


    public void addMoney(int day) {
        money += day * 300000;
    }

    public void showFilm() {
        System.out.println(filmName + "这个电影很不错，主演是" + actorName + "，他的票房总额是" + money);
    }
}
