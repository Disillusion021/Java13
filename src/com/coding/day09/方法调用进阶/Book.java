package com.coding.day09.方法调用进阶;

public class Book {
    String bookName;
    String author;
    double price;

    public void showBook() {
        System.out.println(bookName + "这本书的作者是" + author + "，价格为" + price + "元");
    }
}
