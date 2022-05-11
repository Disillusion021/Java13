package com.coding.Test.StringTest;

public class StringTest {
    // 创建String的两种方式
        // 方式一：直接赋值 String s1 = "wyn"
        // 方式二：构造器 String s2 = new String("wyn");
        // 方式一：先从常量池中查看是否有"wyn"的字符串对象，如果有直接指向，如果没有则在常量池中创建"wyn"，然后指向。s1最终指向的是常量池当中的字符串对象。
        // 方式二：先在常量池中查看是否有"wyn"的字符串对象，如果有就只在堆中创建一个String对象，如果常量池不存在"wyn"会先在常量池中创建一个Sting对象，然后再在堆中创建一个Sting对象。
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
        //再执行 String str5 = sb.toString(); sb.toString()方法在堆中创建了一个(new了一个)String对象并返回，str5指向了堆中的String对象。
        //一共会创建2个池中对象，1个StringBuilder对象，1个堆中String对象
        String str5 = str3 + str4;
        System.out.println(str1 == str2);
        System.out.println(str1 == str5);
        System.out.println("============================================================");
        String s1 = new String("wyn");
        String s2 = s1.intern();
        System.out.println("s1 == s2：" + (s1 == s2));
        System.out.println("s1的地址为：" + Integer.toHexString(System.identityHashCode(s1)));
        System.out.println("s2的地址为：" + Integer.toHexString(System.identityHashCode(s2)));
        System.out.println("============================================================");
        String s3 = new String("www") + new String("ww");
        String s4 = s3.intern();
        String s5 = new String("w") + new String("wwww");
        String s6 = s5.intern();
        String s7 = "wwwww";
        System.out.println("s3 == s4:\t" + (s3 == s4)); //true
        System.out.println("s3 == s7:\t" + (s3 == s7)); //true
        System.out.println("s6 == s3:\t" + (s6 == s3)); //true
        System.out.println("s6 == s5:\t" + (s6 == s5)); //false
        System.out.println("s5 == s3:\t" + (s5 == s3)); //false
        System.out.println("s3的地址为：" + Integer.toHexString(System.identityHashCode(s3)));
        System.out.println("s4的地址为：" + Integer.toHexString(System.identityHashCode(s4)));
        System.out.println("s5的地址为：" + Integer.toHexString(System.identityHashCode(s5)));
        System.out.println("s6的地址为：" + Integer.toHexString(System.identityHashCode(s6)));
        System.out.println("s7的地址为：" + Integer.toHexString(System.identityHashCode(s7)));
        System.out.println("============================================================");
        System.out.println("===============验证new String()是否创建了池中对象===============");
        String s8 = new String("yyy");
        String s9 = new String("yyy");
        String s90 = s9.intern();
        String s80 = s8.intern();
        System.out.println("s80 == s90:\t" + (s80 == s90)); //true
        System.out.println("s90 == s9:\t" + (s90 == s9)); //false
        System.out.println("s80 == s8:\t" + (s90 == s9)); //false
        System.out.println("s8的地址为：" + Integer.toHexString(System.identityHashCode(s8)));
        System.out.println("s9的地址为：" + Integer.toHexString(System.identityHashCode(s9)));
        System.out.println("s80的地址为：" + Integer.toHexString(System.identityHashCode(s80)));
        System.out.println("s90的地址为：" + Integer.toHexString(System.identityHashCode(s90)));
        // 结论: new String()会先再常量池中寻找是否有对象。常量池中若没有，则先在常量池中创建一个Sting对象，然后再在堆中创建一个Sting对象。
        System.out.println("============================================================");
        // 验证StringBuilder的最后一步方法toString会不会创建常量池对象
        String s11 = new String("1") + new String("1111");
        String s12 = new String("11") + new String("111");
        String s14 = s12.intern();
        // 如果StringBuilder的toString方法会在常量池中创建对象，那么s14即s12.intern()不可能返回s12的地址
        System.out.println("s14 == s12:\t" + (s14 == s12)); //true
        System.out.println("s11的地址为：" + Integer.toHexString(System.identityHashCode(s11)));
        System.out.println("s12的地址为：" + Integer.toHexString(System.identityHashCode(s12)));
        System.out.println("s14的地址为：" + Integer.toHexString(System.identityHashCode(s14)));
        // 结论: StringBuilder.toString()不会在常量池中创建对象,只会先在堆中创建对象。
    }
}
