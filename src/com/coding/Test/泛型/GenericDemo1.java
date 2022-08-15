package com.coding.Test.泛型;

import java.util.ArrayList;

import com.coding.Test.Dog;

public class GenericDemo1 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<>();
        arrayList.add(new Dog("旺财"));
        arrayList.add(new Dog("发财"));
        arrayList.add(new Dog("小黄"));
        // 如果使用了泛型,便会对类型有约束,下列语句编译就会报错
        // arrayList.add(new Cat());
        System.out.println("使用泛型可以不用下转型");
        for(Dog dog : arrayList) {
            System.out.println(dog.getName());
        }
    }

    // 泛型的好处
    // 1. 泛型将类型维度降为一种
    // 2. 编译时，可以自动检查元素类型
    // 3. 不使用泛型
    //      Dog -加入-> Object -取出-> Dog //放入到ArrayList会先转成Object，在取出时，还需要转换成Dog
    // 4. 使用泛型
    //      Dog -> Dog -> Dog //放入时和取出时，不需要类型转换，提高效率
}