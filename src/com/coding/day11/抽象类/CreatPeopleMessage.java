package com.coding.day11.抽象类;

public class CreatPeopleMessage extends CreatPeople {
    @Override
    public People creat(String id, String name, int height) {
        People people = new People();
        people.setId(id);
        people.setName(name);
        people.setHeight(height);
        return people;
    }
}
