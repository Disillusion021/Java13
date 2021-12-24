package com.coding.Test.集合;


public class HashSetSample {
    public static void main(String[] args) {
        //模拟一个HashSet的底层(HashMap的底层结构);
        //创建一个Node[]数组
        //有些人，直接把Node[]数组称为表
        HNode[] table = new HNode[16];

        HNode john = new HNode("john");
        HNode jack = new HNode("jack");
        HNode rose = new HNode("rose");
        table[2] = john;
        john.next = jack;
        jack.next = rose;
        HNode lucy = new HNode("lucy");
        table[3] = lucy;
        System.out.println(table);
    }
}

class HNode { //结点，存储数据，可以指向下一个结点，从而形成链表
    Object item; //存放数据
    HNode next; //指向下一个结点
    public HNode(Object item) {
        this.item = item;
    }
}
