package com.coding.day14.Map;

import java.util.*;

public class T2 {

/*
    创建T2类，定义main方法，创建一个Map<String, String>集合，
            map.put("1", "小利")
            map.put("2", "小君")
            map.put("3", "小兰")
            map.put("4", "小鑫")
    创建一个list集合，将map集合中的值取到，并装进list集合中，最后输出list集合中的数据。
*/

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "小利");
        map.put("2", "小君");
        map.put("3", "小兰");
        map.put("4", "小鑫");
        List<String> list = new ArrayList<>();
        Collection<String> values = map.values();
        list.addAll(values);
        System.out.println(list);
    }
}
