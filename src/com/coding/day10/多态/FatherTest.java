package com.coding.day10.多态;

public class FatherTest {
    public void f1(Child1 child1) {
        child1.property();
    }

    public void f2(Child2 child2) {
        child2.property();
    }

    public void f3(Child3 child3) {
        child3.property();
    }

    public void f(Father child) {
        child.property();
    }

    public static void main(String[] args) {
        FatherTest fatherTest = new FatherTest();
        fatherTest.f1(new Child1());
        fatherTest.f2(new Child2());
        fatherTest.f3(new Child3());
        fatherTest.f(new Father());
        fatherTest.f(new Child1());
        fatherTest.f(new Child2());
        fatherTest.f(new Child3());
    }

}
