package com.coding.day12.常用类;

public class Demo6 {

    public static void main(String[] args) {
        String s = "明月几时有？把酒问青天。";
        for (int i = s.length() - 1; i > -1; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
