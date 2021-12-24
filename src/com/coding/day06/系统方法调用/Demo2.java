package com.coding.day06.系统方法调用;

public class Demo2 {

    public static void main(String[] args) {
        //将数字型字符串变成int类型
        int a = Integer.parseInt("2655");
        System.out.println(a);
        //将十进制数字变成二进制字符串
        String b = Integer.toBinaryString(10);
        System.out.println(b);
        //将十进制数字变成十六进制字符串
        String c = Integer.toHexString(10);
        System.out.println(c);
        //将十进制数字变成八进制字符串
        String d = Integer.toOctalString(10);
        System.out.println(d);
        //将整数转换成字符串
        String e = Integer.toString(16);
        System.out.println(e);
        //将字符串转换成int再封装？
        int f = Integer.valueOf(1212);
        System.out.println(f);
    }
}
