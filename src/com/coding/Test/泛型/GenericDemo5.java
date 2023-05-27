package com.coding.Test.泛型;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo5 {
    public static void main(String[] args) {
        Object o = new String("xx");
        // 泛型不具备继承性，下列语句会报错, 知道就行,不重要
        // List<Object> list = new ArrayList<String>();

        // 1. <?> 支持任意泛型类型
        // 2. <? extends A> 支持A类以及A类的子类，规定了泛型的上限
        // 3. <? super A> 支持A类以及A类的父类，不限于直接父类，规定了泛型的下限
        // 通配符是用来规定泛型的范围

        // 举例说明下面三个方法的使用
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

        printCOllection1(list1);
        printCOllection1(list2);
        printCOllection1(list3);
        printCOllection1(list4);
        printCOllection1(list5);

        printCOllection2(list3);
        printCOllection2(list4);
        printCOllection2(list5);
        
        printCOllection3(list1);
        printCOllection3(list3);
    }

    // 说明：List<?> 表示 任意的泛型类型的都可以接受
    public static void printCOllection1(List<?> c){
        System.out.println(c.getClass());
        for (Object o: c) {
            System.out.println(o);
        }
    }

    // ? extends AA 表示 上限，可以接受 List<AA> 或 List<AA的子类>
    public static void printCOllection2(List<? extends AA> c){
        System.out.println(c.getClass());
        for (Object o: c) {
            System.out.println(o);
        }
    }

    // ? super AA 表示 下限，可以接受 List<AA> 或 List<AA的父类>
    public static void printCOllection3(List<? super AA> c){
        for (Object o: c) {
            System.out.println(o);
        }
    }
}

class AA {

}

class BB extends AA {

}

class CC extends BB {

}