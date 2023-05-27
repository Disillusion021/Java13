package com.coding.Test.泛型;
/// 特别强调：**E具体的数据类型在定义Person对象的时候指定，即在编译期间，就确定了E是什么类型**
// 如果不指定泛型,泛型类型默认为Object
// **在指定具体泛型类型后,可以传入该类型或其子类类型**
// 泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型
// 或者是某个方法的返回值的类型，或者是参数类型
public class GenericDemo2<E> {
    E s; //E可以是属性的类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定了E是什么类型

    public GenericDemo2(E s) { // E也可以是参数类型
        this.s = s;
    }

    public E f() {  // E也可以是返回类型
        return s;
    }

    @Override
    public String toString() {
        return "GenericDemo2 [s=" + s + "]";
    }

    public static void main(String[] args) {
        GenericDemo2<String> gs = new GenericDemo2<>("string");
        System.out.println(gs.f().getClass());
        System.out.println(gs); 
        GenericDemo2<Integer> gi = new GenericDemo2<>(1);
        System.out.println(gi.f().getClass()); 
        System.out.println(gi);
    }
}