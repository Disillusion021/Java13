package com.coding.Test.StringTest;

public class StringEquals {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a == b);//true
        System.out.println(a.equals(b));//true
        System.out.println(a == c);//false
        System.out.println(b == c);//false
        System.out.println(a.equals(c));//true
        System.out.println(b.equals(c));//true
    }
}
