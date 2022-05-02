package com.coding.Test.Son;

import com.coding.Test.Father.Father3;

public class Son3 extends Father3 {

    private String book = "儿子的书";

    String getBook() {
        System.out.println("调用了子类的get方法");
        test();
        return book;
    }

    public void test() {
        System.out.println("son");
    }

}
