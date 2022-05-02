package com.coding.Test.Son;

import com.coding.Test.Father.Father2;

public class Son2 extends Father2 {

    private String book = "儿子的书";

    public String getBook() {
        System.out.println("调用了子类的get方法");
        return book;
    }

}
