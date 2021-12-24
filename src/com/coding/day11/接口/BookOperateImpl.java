package com.coding.day11.接口;

import java.util.Scanner;

public class BookOperateImpl implements BookOperate {
    Scanner sc = new Scanner(System.in);

    @Override
    //录入一本书的信息，返回书数组
    public Book[] addBook(Book[] books, int no, String bookName, String author) {
        Book[] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = new Book();
        newBooks[books.length].setNo(no);
        newBooks[books.length].setBookName(bookName);
        newBooks[books.length].setAuthor(author);
        return newBooks;
    }

    @Override
    //将所有书的信息打印出来
    public void selectBook(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getBookName() + "这本书的编号为" + books[i].getNo() + "，作者是" + books[i].getAuthor());
            if (books[i] == null) {
                break;
            }
        }
    }

    @Override
    //根据书的编号找书，修改书名或作者名，返回书数组
    public Book[] updateBook(Book[] books, int no) {
        boolean tag = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getNo() == no) {
                tag = true;
                System.out.println("请输入修改后的书名（若保持不变请输入0）：");
                String bookName = sc.next();
                if (!bookName.equals("0")) {
                    books[i].setBookName(bookName);
                }
                System.out.println("请输入修改后的作者名（若保持不变请输入0）：");
                String author = sc.next();
                if (!author.equals("0")) {
                    books[i].setAuthor(author);
                }
            }
        }
        if (tag) {
            System.out.println("修改成功");
        } else {
            System.out.println("查无此书");
        }
        return books;
    }

    @Override
    //根据书的编号找书，标记这本书（tag），返回除这本书以外的书组成的数组
    public Book[] deleteBook(Book[] books, int no) {
        int tag = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getNo() == no) {
                tag = i;
                break;
            }
        }
        if (tag != -1) {
            Book[] newBooks = new Book[books.length - 1];
            for (int i = 0; i < newBooks.length; i++) {
                if (i < tag) {
                    newBooks[i] = books[i];
                } else {
                    newBooks[i] = books[i + 1];
                }
            }
            System.out.println("删除成功");
            return newBooks;
        } else {
            System.out.println("查无此书");
            return books;
        }
    }

}
