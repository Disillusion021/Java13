package com.coding.day14.集合_List2;

import java.util.List;

public class BookActionImpl implements BookAction{

    @Override
    public Book addBook(String bookName, String author) {
        Book book = new Book();
        book.bookName = bookName;
        book.author = author;
        return book;
    }

    @Override
    public void selectBook(List<Book> list) {
        for (Book b : list) {
            System.out.println(b.bookName + "这本书的作者是" + b.author);
        }
    }
}
