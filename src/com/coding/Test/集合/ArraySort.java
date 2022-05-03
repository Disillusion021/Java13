package com.coding.Test.集合;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

    public static void main(String[] args) {
        Note[] notes = new Note[4];
        notes[0] = new Note("红楼梦", 100);
        notes[1] = new Note("金瓶梅", 90);
        notes[2] = new Note("青年文摘", 5);
        notes[3] = new Note("java从入门到入土", 300);
        System.out.println(Arrays.toString(notes));
        Arrays.sort(notes, new Comparator<Note>() {
            @Override
            public int compare(Note o1, Note o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        System.out.println(Arrays.toString(notes));
    }

}

class Note {
    private String name;
    private int price;

    public Note(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
