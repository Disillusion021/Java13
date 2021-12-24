package com.coding.day08.方法重载;

public class OverLoad {

    public int f1(int a, int b) {
        return a * b;
    }
    public int f1(int a, int b, int c) {
        return a + b + c;
    }
    public String f1(int a, String b) {
        return a + b;
    }
    public String f1(int a) {
        return Integer.toString(a);
    }


    public static void main(String[] args) {
        OverLoad x = new OverLoad();
        System.out.println(x.f1(1,2) + 1);
        System.out.println(x.f1(1,2,3) + 1);
        System.out.println(x.f1(1,"2") + 1);
        System.out.println(x.f1(1) + 1);
    }
}



