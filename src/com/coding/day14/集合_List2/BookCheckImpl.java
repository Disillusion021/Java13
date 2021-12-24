package com.coding.day14.集合_List2;

import java.util.List;

public class BookCheckImpl implements BookCheck {
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

    @Override
    public void findBook(List<Book> list, String bookName) {
        boolean tag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bookName.equals(bookName)) {
                System.out.println("第" + (i + 1) + "本");
                tag = true;
            }
        }
        if (!tag) {
            System.out.println("查无此书");
        }
    }

    @Override
    public void deleteBook(List<Book> list, String bookName) {
        boolean tag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bookName.equals(bookName)) {
                list.remove(i);
                tag = true;
                System.out.println("删除成功");
            }
        }
        if (!tag) {
            System.out.println("查无此书");
        }
    }

    @Override
    public void updateBook(List<Book> list, String oldBookName, String newBookName, String author) {
        boolean tag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bookName.equals(oldBookName)) {
                list.get(i).bookName = newBookName;
                list.get(i).author = author;
                tag = true;
                System.out.println("修改成功");
            }
        }
        if (!tag) {
            System.out.println("查无此书");
        }
    }
}
