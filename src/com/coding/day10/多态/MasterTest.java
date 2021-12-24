package com.coding.day10.多态;

public class MasterTest {
    public static void main(String[] args) {
        Master master = new Master();
        master.feed(new Animal());
        master.feed(new PetDog());
        master.feed(new PetCat());
    }
}
