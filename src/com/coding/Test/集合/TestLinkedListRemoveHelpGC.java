package com.coding.Test.集合;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class TestLinkedListRemoveHelpGC<E> extends LinkedList<E> {

    transient int size = 0;

    transient TestLinkedListRemoveHelpGC.Node<E> first;

    transient TestLinkedListRemoveHelpGC.Node<E> last;

    @Override
    public int size() {
        return size;
    }

    private static class Node<E> {
        E item;
        TestLinkedListRemoveHelpGC.Node<E> next;
        TestLinkedListRemoveHelpGC.Node<E> prev;

        Node(TestLinkedListRemoveHelpGC.Node<E> prev, E element, TestLinkedListRemoveHelpGC.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public E removeFirst() {
        final TestLinkedListRemoveHelpGC.Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        System.out.println("调用了重写的removeFirst方法");
        return unlinkFirst(f);
    }

    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    void linkLast(E e) {
        final TestLinkedListRemoveHelpGC.Node<E> l = last;
        final TestLinkedListRemoveHelpGC.Node<E> newNode = new TestLinkedListRemoveHelpGC.Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

    private E unlinkFirst(TestLinkedListRemoveHelpGC.Node<E> f) {
        // assert f == first && f != null;
        final E element = f.item;
        final TestLinkedListRemoveHelpGC.Node<E> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        modCount++;
        System.out.println("调用了重写的unlinkFirst方法");
        return element;
    }

    public TestLinkedListRemoveHelpGC() {
    }

    public static void main(String[] args) {
        TestLinkedListRemoveHelpGC<Object> myList = new TestLinkedListRemoveHelpGC<>();
        // 构建测试用数组
        for (int i = 0; i < 1000000; i++) {
            myList.add(new Book("红楼梦","曹雪芹",34.6));
        }
        myList.removeFirst();
        System.out.println(myList.size());
    }
}
