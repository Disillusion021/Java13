package com.coding.动态绑定机制;

/*  java的动态绑定机制
    1. 当调用对象方法的时候，该方法会和该对象的内存地址/运行类型进行绑定
    2. 当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
 */
public class TestDynamicBinding {
    public static void main(String[] args) {
        // a的编译类型是A，运行内存是B
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
