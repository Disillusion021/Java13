package com.coding.Test.泛型;

public class CustomGenericMethod {
    // 泛型方法
    // 修饰符 <T, R> 返回类型 方法名(参数列表) {
    //      泛型方法的最主要特点就是在返回类型前加了泛型标识符
    // }

    // 注意细节
    // 1. 泛型方法，可以定义在普通类中，也可以定义在泛型类中
    // 2. 当泛型方法被调用时，类型会确定
    // 3. public void eat(E e) {},修饰符后没有<T, R>泛型标识符的方法不是泛型方法，而是使用了泛型的普通方法。
}

// 泛型方法，可以定义在普通类中，也可以定义在泛型类中
class Car {
    public void run() { //普通方法

    }
    // 说明
    // <T, R> 就是泛型
    // 是提供给 fly方法使用的
    public <T, R> void fly(T t, R r) { // 泛型方法

    }
}

class Fish {
    public void run() { //普通方法

    }
    // 说明
    // <T, R> 就是泛型
    // 是提供给 fly方法使用的
    public <T, R> void fly(T t, R r) { // 泛型方法

    }
}
