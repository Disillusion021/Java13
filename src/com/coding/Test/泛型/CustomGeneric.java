package com.coding.Test.泛型;

public class CustomGeneric {
    public static void main(String[] args) {
        Tiger<Double, String, Integer> g = new Tiger("john");
        g.setT(10.9);
        System.out.println("g1=" + g);
        Tiger g2 = new Tiger("john~~");
        g2.setT("yy");
        System.out.println("g2=" + g2);
    }
}

// 注意细节
// 1. 普通成员(普通属性和普通方法)可以使用泛型
// 2. 使用泛型的数组，不能初始化
// 3. 静态成员(静态属性和静态方法)中不能使用类的泛型
// 4. 泛型类的类型，是在创建对象时确定的(因为创建对象时，需要指定确定类型)
// 5. 如果在创建对象时，没有指定类型，默认为Object
class Tiger<T, R, M> {

    R r; // 普通属性使用泛型
    M m;
    T t;
    T[] ts;
    // 泛型数组，不能初始化，因为数组在new不能确定T的类型，就无法在内存开辟空间。
    // T[] ts = new T[5];
    // 静态属性和静态方法不能使用泛型
    // 因为静态是和类相关的，在类加载时，对象还没有创建，而泛型是在创建对象时指定的
    // 所以，如果静态属性和静态方法使用了泛型，JVM就无法完成初始化，JVM还不知道泛型的具体类型
    // static R r2;
    // public static void m1(M m) {

    // }

    // 构造器使用泛型
    public Tiger(R r, M m, T t) {
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public Tiger(M m) {
        this.m = m;
    }

    // 返回类型可以使用泛型
    public R getR() {
        return r;
    }
    // 普通方法使用泛型
    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Tiger [m=" + m + ", r=" + r + ", t=" + t + "]";
    }
    
}