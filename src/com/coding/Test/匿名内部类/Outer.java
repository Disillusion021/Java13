package com.coding.Test.匿名内部类;
//匿名内部类：本质是一个隐藏了名字的内部类，并且创建了一个对象。
//        基本语法：
//        new 类 or 接口（参数列表）{
//        类体
//        };
//
//        0. 基于接口的匿名内部类
//        1. 需求：想使用Animal接口，并创建对象
//        2. 传统方式，是写一个类，实现该接口，并创建对象
//        3. 现在的需求是：Cat类只是使用一次，后面不再使用，可不可以不单独为了这一次的使用创建一个Cat类
//        4. 可以使用匿名内部类来简化开发
//        5. Cat的编译类型是? 编译类型就是等号左边的Animal
//        6. Cat的运行类型是? 运行类型就是这个匿名内部类
//              匿名内部类的底层：
//              class 匿名内部类名 implements Animal {
//                  @Override
//                  方法重写
//              }
//			其实底层里匿名内部类的确创建了一个类并实现了接口，而且默认赋予了一个类名，这个类名就等于外部类名+$1/2/3...
//        7. jdk底层在创建匿名内部类，立即就创建了一个匿名内部类的实例
//        8. 匿名内部类只能使用一次

public class Outer {
    public static void talk(Animal animal){
        animal.speak();
    }
    public static void main(String[] args) {
//        Animal cat = new Cat();
//        cat.speak();
//        Animal dog = new Dog();
//        dog.speak();
        Animal cat = new Animal(){
            @Override
            public void speak() {
                System.out.println("小猫喵喵叫");
            }
        };
        Animal dog = new Animal(){
            @Override
            public void speak() {
                System.out.println("小狗汪汪叫");
            }
        };
        cat.speak();
        dog.speak();

        //匿名内部类可以直接作为实参传递给方法中的形参。可以实现一种简洁灵活的多态。
        talk(
                new Animal(){
                    @Override
                    public void speak() {
                        System.out.println("老虎震天啸");
                    }
                }
        );
        talk(
                new Animal(){
                    @Override
                    public void speak() {
                        System.out.println("狮子怒涛吼");
                    }
                }
        );
    }
}

interface Animal {
    void speak();
}

//class Cat implements Animal {
//    @Override
//    public void speak() {
//        System.out.println("小猫喵喵叫");
//    }
//}
//class Dog implements Animal {
//    @Override
//    public void speak() {
//        System.out.println("小狗汪汪叫");
//    }
//}
