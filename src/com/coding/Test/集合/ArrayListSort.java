package com.coding.Test.集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort {

    public static void sort(List<Note> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if ((list.get(j)).getPrice() < (list.get(j + 1)).getPrice()) {
                    Note temp;
                    temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Note> list = new ArrayList<>();
        list.add(new Note("红楼梦", 100));
        list.add(new Note("金瓶梅", 90));
        list.add(new Note("青年文摘", 5));
        list.add(new Note("java从入门到入土", 300));
        // 原集合
        System.out.println(list);
        sort(list);
        // 排序后
        System.out.println(list);
        // Collections工具类排序
        Collections.sort(list, new Comparator<Note>() {
            @Override
            public int compare(Note o1, Note o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        System.out.println(list);
        Collections.sort(list, (o1, o2) -> o2.getPrice() - o1.getPrice());
        System.out.println(list);
    }
}
