package com.coding.day11.接口;

import java.util.List;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookOperate bookOperate = new BookOperateImpl();
        int count = 0;
        Book[] temp = new Book[100];
        while (true) {
            //每次操作开始前将temp中不为空的值传入books数组里
            int tempNum = 0;
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] != null) {
                    tempNum++;
                }
            }
            Book[] books = new Book[tempNum];
            int j = 0;
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] != null) {
                    books[j] = temp[i];
                    j++;
                }
            }

            System.out.println("请选择：1.添加图书 2.修改图书 3.删除图书 4.显示所有图书 5.退出");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("请输入编号：");
                int no = sc.nextInt();
                System.out.println("请输入图书名：");
                String bookName = sc.next();
                System.out.println("请输入作者：");
                String author = sc.next();
                Book[] newBooks = bookOperate.addBook(books, no, bookName, author);
                for (int i = 0; i < newBooks.length; i++) {
                    temp[i] = newBooks[i];
                }
                System.out.println("添加成功");
            } else if (choose == 2) {
                System.out.println("请输入要修改的书的编号：");
                int no = sc.nextInt();
                System.arraycopy(bookOperate.updateBook(books, no), 0, temp, 0, books.length);
            } else if (choose == 3) {
                System.out.println("请输入要删除的书的编号：");
                int no = sc.nextInt();
                System.arraycopy(bookOperate.deleteBook(books, no), 0, temp, 0, books.length - 1);
                temp[books.length - 1] = null;
            } else if (choose == 4) {
                bookOperate.selectBook(books);
            } else if (choose == 5) {
                return;
            } else {
                System.out.println("输入错误，请重试");
            }
        }
    }
}
