package com.coding.day04.数组;

public class Demo5 {

    public static void main(String[] args) {
        String[] a = {"辽宁省", "大连市", "高新区", "赛伯乐大厦603"};
        String text = "";
        for (int i = 0; i < a.length; i++) {
            text += a[i];
        }
        System.out.println(text);
    }
}
