package com.coding.Test.StringTest;

public class StringTest2 {
    String str = new String("hsp");
    final char[] ch = {'j','a','v','a'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        StringTest2 ex = new StringTest2();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + "and");
        System.out.println(ex.ch);
    }
}
