package com.coding.Test;

public class InnerClassFinalTest {
    /**
     * Q: 测试为什么局部内部类和匿名内部类都只能访问final的局部变量
     * A: 1. 因为内部类的对象生命周期不随方法结束而销毁,
     *       而内部类所在方法的局部变量随方法结束而销毁。
     *       因此方法结束后为了保持内部类对象所用到的局部变量值，Java会把局部变量的值复制一份以内部类成员变量的形式传递给内部类。
     *       这样，即使方法结束了，内部类对象还是有值。
     *       但是，原则上是如果内部类对所用到的局部变量进行修改，方法内的局部变量应该也跟着变化。
     *       然而，内部类对象和方法的局部变量生命周期根本不在一个维度。所以没有基础，也无法实现同步变化。
     *       因此，Java采取了现在的做法，即：
     *       如果内部类使用了局部变量，那么该局部变量必须被final修饰，不可被修改。不允许内部类使用普通的局部变量。
     *       Effective final就是内部类使用局部变量即使代码中不加final，编译时会默认给你添加上。是一种语法糖。
     */
    private int age = 12;

    public void outPrint(int x) {
        class InClass {
            public void InPrint() {
                System.out.println(x);
                System.out.println(age);
            }
        }
        new InClass().InPrint();
    }

    public static void main(String[] args) {
        InnerClassFinalTest innerClassFinalTest = new InnerClassFinalTest();
        innerClassFinalTest.outPrint(10);
    }
}
