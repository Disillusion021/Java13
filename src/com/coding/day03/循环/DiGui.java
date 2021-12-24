package com.coding.day03.循环;

public class DiGui {
    int f(int n) {
        if (n == 1) {
            return 1;
        }
       return f(n-1) * n;
    }
    public static void main(String[] args) {
        DiGui o = new DiGui();
        System.out.println(o.f(10));
    }

}
