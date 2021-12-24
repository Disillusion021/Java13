package com.coding.day12.常用类;

public class Demo4 {
    public static void main(String[] args) {
        String s = "用心聆听，深深呼吸，烟花雨，梨花月，寄一缕风的香魂，远离喧嚣";
        int r = s.indexOf("烟");
        System.out.println(r);
        for (int i = r + 1; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
