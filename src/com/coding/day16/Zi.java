package com.coding.day16;

import java.util.HashSet;
import java.util.Set;

public class Zi {

    public static void main(String[] args) {
        String s = "0100110001010001";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                set.add(s.substring(i, j));
            }
        }
        System.out.println(set);
        System.out.println("字符串" + s + "共有" + set.size() + "个不同的非空子串");
    }
}
