package com.coding.Test.StringTest;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "hello";
        //实际上编译器会做优化，不会创建"he"和"llo"对象，只会编译成一个"hello"对象，然后去常量池里找，有则指向，无则创建。
        String str2 = "he" + "llo";
        String str3 = "he";
        String str4 = "llo";
        //验证字符串相加，到底创建了几个对象
        //先创建了一个StringBuilder对象 StringBuilder sb = new StringBuilder();
        //执行  sb.append("he");
        //再执行 sb.append("llo");
        //再执行 String str5 = sb.toString(); sb.toString()方法在堆中创建了一个(new了一个)String对象并返回，这个堆中String对象的value属性则指向常量池中的“hello”，常量池中若没有"hello"String对象则会创建一个"hello"String对象,而str5则指向了堆中的那个对象。
        //所以若常量池中没有"hello"对象，一共会创建2个池中对象，1个StringBuilder对象，1个堆中String对象，和1个池中"hello"对象
        //所以若常量池中有"hello"对象，一共会创建2个池中对象，1个StringBuilder对象，1个堆中String对象
        String str5 = str3 + str4;
        System.out.println(str1 == str2);
        System.out.println(str1 == str5);
    }
}
