package com.coding.Test.StaticTest;

public class Test {
    public static int a = 1;
    //普通方法可以调用非静态成员，静态方法只能直接调用静态成员
    public void so(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        new Test().so();
    }
}
