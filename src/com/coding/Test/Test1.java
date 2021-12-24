package com.coding.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put(null, "美国");

        System.out.println(map.get(null));

        System.out.println(map);

    }

}