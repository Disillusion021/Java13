package com.coding.day12.常用类;

public class Demo5 {
    public static void main(String[] args) {
        String s = "我和你，我我我，你我我，我我你";
        char[] chars = s.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == '我') {
                count++;
            }
        }
        System.out.println(count);
    }
}
