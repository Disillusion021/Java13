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

// 匿名内部类和局部内部类差不多，都是局部内部类，只不过局部内部类是自己声明了一个类，在作用域里手动new一个来使用
// 而匿名内部类是在局部方法或代码块内(临时)继承一个类或实现一个接口，并且在继承或实现的同时new了一个实例出来。
// 匿名内部类和局部内部类都相当于一个局部变量，都可以直接调用外部类的所有成员。
// 而lambda表达式与匿名内部类相似，不过lambda表达式只能用于只有一个方法的接口(抽象类和类都不可以),相当于直接动态实现了这个接口，并实现了接口的唯一的抽象方法。

public class Outer {
    public static void talk(Animal animal){
        animal.speak();
    }

    public static void talk(Person person) {
        person.speak();
    }

    private static void speakLoudly() {
        System.out.println("超大声讲话");
    }

    public static void main(String[] args) {

        Animal cat0 = new Cat();
        cat0.speak();
        Animal dog0 = new Dog();
        dog0.speak();

        Animal cat = new Animal(){
            @Override
            public void speak() {
                System.out.println("小猫喵喵叫");
                speakLoudly();
            }
        };
        Animal dog = new Animal(){
            @Override
            public void speak() {
                System.out.println("小狗汪汪叫");
                speakLoudly();
            }
        };
        talk(cat);
        talk(dog);

        //匿名内部类可以直接作为实参传递给方法中的形参。可以实现一种简洁灵活的多态。
        talk(
                new Animal(){
                    @Override
                    public void speak() {
                        System.out.println("老虎震天啸");
                        speakLoudly();
                    }
                }
        );
        talk(
                new Animal(){
                    @Override
                    public void speak() {
                        System.out.println("狮子怒涛吼");
                        speakLoudly();
                    }
                }
        );

        talk(
                new Person() {
                    @Override
                    public void speak() {
                        System.out.println("学生讲了些闲话");
                        speakLoudly();
                    }
                }
        );

        talk(()-> System.out.println("啊啊啊啊啊"));
    }
}

interface Animal {
    void speak();
}

 class Person {
    void speak() {
        System.out.println("老师讲了一堆废话");
    }
}
class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("小猫喵喵叫");
    }
}
class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("小狗汪汪叫");
    }
}
