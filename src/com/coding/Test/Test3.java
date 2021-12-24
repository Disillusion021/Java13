package com.coding.Test;

public class Test3 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he" + "llo";
        System.out.println(Integer.toHexString(System.identityHashCode("he")));
        System.out.println(Integer.toHexString(System.identityHashCode("llo")));
        System.out.println(Integer.toHexString(System.identityHashCode("hello")));
        System.out.println(Integer.toHexString(System.identityHashCode(str1)));
        System.out.println(Integer.toHexString(System.identityHashCode(str2)));
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        //结论：说明字符串为常量,str1和str2中存放的都是直接对字符串常量"hello"的引用,打印出来的即hash16进制地址。
        // == 比较的是栈中变量存放的数据，若是基本变量，则比较的是其存放的字节值，若是引用变量则是比较其内所存放的所直接引用的对象的地址,比较的是第一级引用对象的地址。
        // 这里str1和str2都是引用变量，存放的也都是方法区中字符串常量"hello"的地址，故无论是 == 还是 equals 比较的结果都为true。
        System.out.println("--------------------------");
        System.out.println(Integer.toHexString(System.identityHashCode("llo")));
        System.out.println(Integer.toHexString(System.identityHashCode(new String("llo"))));
        //结论：字符串常量"llo"的地址存放在方法区中，new String("llo")的地址存放在堆中。
        System.out.println("--------------------------");
        System.out.println(Integer.toHexString(System.identityHashCode("hello")));
        String newString = "he" + new String("llo");
        System.out.println(Integer.toHexString(System.identityHashCode(newString)));
        System.out.println("hello" == newString);
        System.out.println("hello".hashCode());
        System.out.println(newString.hashCode());
        System.out.println("hello".equals(newString));
        //结论：字符串常量"llo"的地址存放在方法区中，"he" + new String("llo") 作为新的对象其地址也存放在堆中。
        System.out.println("--------------------------");
        String str3 = "he" + new String("llo");
        System.out.println(Integer.toHexString(System.identityHashCode(str1)));
        System.out.println(Integer.toHexString(System.identityHashCode(str3)));
        System.out.println(str1 == str3);
        //很有可能String类重写了hashcode()方法,使两个Sting类型的对象(引用变量),只要值字符串值相同，hashcode()方法返回的hash值都一样，这样不论String类型的对象(变量)是直接引用方法区里的字符串常量还是间接引用，只要字符串值相同，两个字符串的hashcode码一定相同，
        // equals()方法会先用==比较identityHashcode比较，如果值相同返回结果就会为true,如果identity值不同,则会比较字符串长度，再将字符串转换为char数组循环一个个比较char字符来判断两个字符串存放的值是否相等。但只要字符串存放的字符串相同，那么hashCode一定相同。
        System.out.println(str1.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str1.equals(str3));
    }

}


