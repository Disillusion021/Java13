package com.coding.day12.常用类;

public class Demo14 {

    public static void main(String[] args) {
        String s = "故人西辞黄鹤楼，烟花三月下扬州";
        for (int i = 0; i < 13; i += 2) {
            s = s.replace(s.charAt(i), '利');
        }
        System.out.println(s);
    }
}
