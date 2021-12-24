package com.coding.Test.异常;

public class TestException {

}

class ReturnExceptionDemo {
    static void A() {
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("调用A方法的finally");
        }
    }

    static void B() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("调用B方法的finally");
        }
    }

    public static void main(String[] args) {
        try {
            A();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        B();
    }
}