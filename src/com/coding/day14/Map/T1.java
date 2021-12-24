package com.coding.day14.Map;

import java.util.HashMap;
import java.util.Map;

public class T1 {

/*
    创建T1类，定义main方法，创建一个Map对象
            (Map<Integer, String> map = new HashMap<>();)
    将“爱”“我”“中”“华”四个字符串当做map集合的值，键分别为1， 2， 3， 4
    根据键，从map集合中取出四个值并输出。
*/

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "爱");
        map.put(2, "我");
        map.put(3, "中");
        map.put(4, "华");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
    }

}
