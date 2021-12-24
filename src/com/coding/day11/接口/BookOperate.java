package com.coding.day11.接口;

public interface BookOperate {
    Book[] addBook(Book[] books, int no, String bookName, String author);

    void selectBook(Book[] books);

    Book[] updateBook(Book[] books, int no);

    Book[] deleteBook(Book[] books, int no);
}
