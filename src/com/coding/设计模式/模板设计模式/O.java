package com.coding.设计模式.模板设计模式;
//  相同的继承，不同的定义抽象方法，子类重写。
//  设计一个模板。所有子类都可以复用这个模板。
public abstract class O {
    public abstract void job();
    public void calculate(String name){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println(name + "运行时间为：" + (end - start));
    };
}