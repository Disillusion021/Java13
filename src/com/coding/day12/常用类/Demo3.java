package com.coding.day12.常用类;

public class Demo3 {
    public static void main(String[] args) {
        String s = "曾经沧海难为水，除却巫山不是云";
        for (int i = 1; i < s.length(); i+=2) {
            System.out.println(s.charAt(i));
        }
    }
}
