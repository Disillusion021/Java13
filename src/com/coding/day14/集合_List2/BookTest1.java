package com.coding.day14.集合_List2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTest1 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        BookCheck bookCheck = new BookCheckImpl();
        while (true) {
            System.out.println("请选择：1.添加图书 2.删除图书 3.修改图书名和作者 4.显示全部图书信息 5.退出");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("请输入书名：");
                String bookName = sc.next();
                System.out.println("请输入作者：");
                String author = sc.next();
                list.add(bookCheck.addBook(bookName, author));
            }
            else if (choose == 2) {
                System.out.println("请输入要删除的书名：");
                String bookName = sc.next();
                bookCheck.deleteBook(list, bookName);
            } else if (choose == 3) {
                System.out.println("请输入要修改的书名：");
                String oldBookName = sc.next();
                System.out.println("请输入修改后的书名：");
                String newBookName = sc.next();
                System.out.println("请输入修改后的作者：");
                String author = sc.next();
                bookCheck.updateBook(list, oldBookName, newBookName, author);
            } else if (choose == 4) {
                bookCheck.selectBook(list);
            } else if (choose == 5) {
                System.out.println("退出成功！");
                break;
            } else {
                System.out.println("输入错误，请重试");
            }
        }
    }
}
