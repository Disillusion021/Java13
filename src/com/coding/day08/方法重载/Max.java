package com.coding.day08.方法重载;

public class Max {

    public int getMax(int a, int b, int c) {
        return a>b?a>c?a:c:b>c?b:c;
    }
    public double getMax(double a, double b, double c) {
        return a>b?a>c?a:c:b>c?b:c;
    }
    public String getMax(String a, String b, String c) {
        return a.length()>b.length()?a.length()>c.length()?a:c:b.length()>c.length()?b:c;
    }

    public static void main(String[] args) {
        Max x = new Max();
        System.out.println(x.getMax(1, 2, 3));
        System.out.println(x.getMax(1.0, 2.0, 3.0));
        System.out.println(x.getMax("ab", "abc", "a"));
    }
}
