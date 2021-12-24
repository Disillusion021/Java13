package com.coding.day09.方法调用进阶;

public class Store {
    public Book creatBook(String bookName, String author, double price) {
        Book b1 = new Book();
        b1.bookName = bookName;
        b1.author = author;
        b1.price = price;
        return b1;
    }

    public static void main(String[] args) {
        new Store().creatBook("Harry Potter", "J·K·罗琳", 68).showBook();
    }
}
