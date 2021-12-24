package com.coding.day11.抽象类;

public class DragonTest {
    public static void main(String[] args) {
        Dragon westPeople = new WestPeople();
        Dragon eastPeople = new EastPeople();
        westPeople.appearance();
        eastPeople.appearance();
    }
}
