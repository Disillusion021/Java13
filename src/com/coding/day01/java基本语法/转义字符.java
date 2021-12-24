package com.coding.day01.java基本语法;

public class 转义字符 {
    public static void main(String[] args) {
        System.out.println("fsadf\nsdaf");
        System.out.println((char) 90);
        System.out.println("" + 'A' + '\n' + 'Z');
        System.out.println("" + 'A' + '\t' + 'Z');
        //转义字符也是char
        //转义字符/' /" //打印双引号
        // ‘+’ 号会自动转换将加号左右两端的数据转换成int类型处理
        System.out.println('A' + 'Z');
        boolean b2 = 1>2&&2<(3/0);
        System.out.println(b2);
//        boolean b1 = 1>2&2<(3/0);
        System.out.println(2<<2);
        System.out.println((char)99);
        //运算顺序：算术运算符 > 关系运算符 > 逻辑运算符 > 赋值运算符
        //逻辑顺序：逻辑非 > 逻辑与 > 逻辑或
    }
}
