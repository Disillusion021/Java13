package com.coding.day12.常用类;

public class Demo11 {
    public static void main(String[] args) {
        String s = "夜来风雨声";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0, i + 1));
        }
    }
}
