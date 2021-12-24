package com.coding.Test;

public class Test17 {
    protected static final Test17 PERSON = new Test17();

    int age = 10;

    String name = "小刚";


    public static void main(String[] args) {

        PERSON.age = 20;

        System.out.println(PERSON.age);

    }
}

