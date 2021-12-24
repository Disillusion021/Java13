package com.coding.Test.集合;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListSource {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        System.out.println("linkedList=" + linkedList);
        linkedList.remove();
        //list没有索引只能通过get方法，从两端里近的那一端开始寻找
        System.out.println(linkedList.get(0));
    }
}
