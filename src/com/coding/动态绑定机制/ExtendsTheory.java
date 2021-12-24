package com.coding.动态绑定机制;

public class ExtendsTheory {
    public static void main(String[] args) {
        //创建对象的过程
        //首先会从Object类开始从父类到子类加载类信息
        //接着会创建对象，先初始化父类的属性和代码块，接着执行父类的构造方法，然后初始化子类的属性和代码块，接着执行子类的构造方法。
        //但创建子类对象，并不会创建父类对象。***这很关键***
        //若通过对象.调用属性，会先从编译类型，由子类到父类的顺序寻找属性。
        //静态属性，静态方法，非静态属性都可以被继承但不能被重写，因此不能实现多态。非静态方法可以被继承和重写，且为动态绑定，因此可以实现多态。
        //静态属性，非静态属性，静态方法都是看编译类型，有隐藏机制，可继承但不能被重写，不能实现多态。
        //动态绑定，所有非静态方法调用时都是从子类(运行类型)开始找，与其声明位置和编译类型无关。
        Father son = new Sson();
        son.hobby = "看美女";
        System.out.println(son.name);
        System.out.println(son.hobby);
    }
}

class GrandPa {
    String name = "爷爷";
    String hobby = "钓鱼";
}

class Father extends GrandPa{
    String name = "爸爸";
    int age = 39;
}

class Sson extends Father {
    String name = "儿子";
}
