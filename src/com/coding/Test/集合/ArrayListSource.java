package com.coding.Test.集合;

import java.util.ArrayList;
import java.util.Collection;

// ArrayListSource源码解读
public class ArrayListSource {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//    ArrayList list = new ArrayList(8);
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        for (int i = 11; i < 16; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
