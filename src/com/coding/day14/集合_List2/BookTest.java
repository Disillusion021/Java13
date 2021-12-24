package com.coding.day14.集合_List2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        BookAction bookAction = new BookActionImpl();
        while (true) {
            System.out.println("请选择：1.添加图书 2. 显示图书信息 3. 退出");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("请输入书名：");
                String bookName = sc.next();
                System.out.println("请输入作者：");
                String author = sc.next();
                list.add(bookAction.addBook(bookName, author));
            }
            else if (choose == 2) {
                bookAction.selectBook(list);
            } else if (choose == 3) {
                break;
            } else {
                System.out.println("输入错误，请重试");
            }
        }
    }
}
