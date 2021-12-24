package com.coding.day12.常用类;

public class Demo12 {
    public static void main(String[] args) {
        String s = "我，爱，你，中，国";
        String[] split = s.split("，");
        for (String s1 : split) {
            System.out.println(s1);
        }
    }
}
