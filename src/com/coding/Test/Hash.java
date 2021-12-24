package com.coding.Test;

public class Hash {
    public static void main(String[] args) {

        Object obj = new Object();
        //直接打印对象，打印的应该是转换为16进制的hashcode
        System.out.println(obj);
        //获取指定对象obj的hashcode
        int value = System.identityHashCode(obj);
        int value1 = obj.hashCode();
        //将hashcode转换成16进制字符串
        System.out.println(Integer.toHexString(value));
        System.out.println(Integer.toHexString(value1));
        //结论：直接打印引用变量会打印此引用变量存储的hash地址，也就是其所引用的对象的hashcode16进制地址
        String str = "hello";
        System.out.println(Integer.toHexString(System.identityHashCode("hello")));
        System.out.println(Integer.toHexString(System.identityHashCode(str)));

        String s = new String("world");
        //String类重写了hashcode方法
        System.out.println(Integer.toHexString(s.hashCode()));
        //所以两个对象hashcode相同
        System.out.println(Integer.toHexString("world".hashCode()));
        //但是System.identityHashCode()是Object类原始的hashcode,因此只要是两个对象，hashcode就不想同
        System.out.println(Integer.toHexString(System.identityHashCode(s)));
        System.out.println(Integer.toHexString(System.identityHashCode("world")));
    }
}
