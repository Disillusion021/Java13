package com.coding.day14.集合_List2;

import java.util.List;

public interface BookAction {

    Book addBook(String bookName, String author);

    void selectBook(List<Book> list);
}
