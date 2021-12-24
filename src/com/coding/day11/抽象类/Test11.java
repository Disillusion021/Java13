package com.coding.day11.抽象类;

public class Test11 extends AbstractTest {

    @Override
    public int f1(int a, int b) {
        return (a + b);
    }

    @Override
    public String f2(String name, int age) {
        return name + age;
    }

    public void setA(){
        a = 10;
    }

    public void setAbc(){
        abc = 10;
    }

    public static void main(String[] args) {
        Test11 obj = new Test11();
        obj.setA();
        obj.setAbc();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(abc);
        System.out.println(aaa);
        System.out.println(Test11.abc);
    }
}
