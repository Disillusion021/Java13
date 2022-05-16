package com.coding.Test.集合;

public class LinkedListSample {
    // 模拟一个LinkedList集合的底层
    public static void main(String[] args) {
        Node jack = new Node("Jack");
        Node rose = new Node("Rose");
        Node hsp = new Node("韩顺平");
        Node wyn = new Node("王英男");

        Node first = jack;
        Node last = rose;
        jack.next = hsp;
        hsp.next = wyn;
        wyn.next = rose;
        rose.pre = wyn;
        wyn.pre = hsp;
        hsp.pre = jack;

        //循环遍历数组
        while (first != null) {
            System.out.println(first);
            first = first.next;
        }

        //插入姐姐节点
        Node sister = new Node("姐姐的柔软");
        wyn.next = sister;
        sister.next = rose;
        rose.pre = sister;
        sister.pre = wyn;
        //循环遍历数组
        first = jack;
        while (first != null) {
            System.out.println(first);
            first = first.next;
        }
        //循环遍历数组
        while (last != null) {
            System.out.println(last);
            last = last.pre;
        }
    }
}

// 定义一个Node类，Node对象表示双向链表的一个节点
class Node {
    public Object item; // 真正存放数据
    public Node next; // 指向下一个节点
    public Node pre; // 指向下一个节点

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}
