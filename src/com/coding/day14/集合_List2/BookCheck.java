package com.coding.day14.集合_List2;

import java.util.List;

public interface BookCheck {
    Book addBook(String bookName, String author);

    void selectBook(List<Book> list);

    void findBook(List<Book> list, String bookName);

    void deleteBook(List<Book> list, String bookName);

    void updateBook(List<Book> list, String oldBookName, String newBookName ,String Author);
}
