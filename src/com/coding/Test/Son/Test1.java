package com.coding.Test.Son;

import com.coding.Test.Father.Father1;

public class Test1 {
    // 测试编译类型为 Father，运行时类型为 Son时调用同名属性
    public static void main(String[] args) {
        Father1 sonOfFather = new Son1();
        System.out.println(sonOfFather.book); // 会输出爸爸的书
        Son1 sonOfSon = new Son1();
        System.out.println(sonOfSon.book); // 会输出儿子的书
    }
}
