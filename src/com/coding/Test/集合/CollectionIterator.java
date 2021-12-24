package com.coding.Test.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Collection接口继承了Iterable接口，所以ArrayList类实现了Collection也必须实现Iterable必须重写iterator方法,重写后的方法返回一个适用于该集合的迭代器.
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("小李飞刀","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        // 迭代器的重置
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        //增强for循环，底层还是迭代器
        for (Object o : col) {
            System.out.println(o);
        }

    }
}

class Book {

    String name;
    String author;
    double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}