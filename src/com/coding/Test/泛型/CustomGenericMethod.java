package com.coding.Test.泛型;
// 当泛型方法被调用传参时，泛型被确定。
public class CustomGenericMethod {
    // 泛型方法
    // 修饰符 <T, R> 返回类型 方法名(参数列表) {
    // 泛型方法的最主要特点就是在返回类型前加了泛型标识符
    // }

    // 注意细节
    // 1. 泛型方法，可以定义在普通类中，也可以定义在泛型类中
    // 2. 当泛型方法被调用时，类型会确定
    // 3. public void eat(E e) {},修饰符后没有<T, R>泛型标识符的方法不是泛型方法，而是使用了泛型的普通方法。
    public static void main(String[] args) {
        new Car().fly("宝马", 100);
        new Fish<>().hi("玛莎拉蒂");
        new Fish<Double, String>().hello("String", 1.0);;
    }
}

// 泛型方法，可以定义在普通类中，也可以定义在泛型类中
class Car {
    public void run() { // 普通方法

    }

    // <T, R> 就是泛型
    // 是提供给 fly方法使用的
    public <T, R> void fly(T t, R r) { // 泛型方法
        System.out.println(t.toString() + r.toString());
    }
}

class Fish<T, R> {
    public void run() { // 普通方法

    }

    // <T, R> 就是泛型
    // 是提供给 fly方法使用的
    public <U, M> void fly(U u, M m) { // 泛型方法

    }

    // 泛型方法既可以使用类声明的泛型，也可以使用自己声明的泛型。
    public <L> void hello(L l, T t) {
        System.out.println(l.getClass());
        System.out.println(t.getClass());
    }

    // hi方法并不是泛型方法，而是方法使用了泛型
    public void hi(T t) {
        System.out.println(t.getClass());
    }
}
