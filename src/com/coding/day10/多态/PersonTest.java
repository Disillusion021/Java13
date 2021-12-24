package com.coding.day10.多态;

public class PersonTest {
    public static void main(String[] args) {
        Person child1 = new PersonChild1();
        Person child2 = new PersonChild2();
        Person child3 = new PersonChild3();
        new Person().skill();
        child1.skill();
        child2.skill();
        child3.skill();
    }
}
