package com.coding.Test.集合;

import java.util.ArrayList;

// ArrayListSource源码解读
public class ArrayListSource {
    public static void main(String[] args) {
        // ArrayList 线程不安全但效率高，如果是有参构造按1.5倍扩容，如果是无参，则第一次是10，第二次开始按1.5倍扩容
        ArrayList list = new ArrayList();
        // ArrayList list = new ArrayList(8);
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
