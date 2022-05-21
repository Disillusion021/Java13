package com.coding.Test.集合;

import java.util.*;
import java.util.function.Consumer;

public class TestLinkedListRemoveHelpGC<E> extends LinkedList<E> {

    static ListIterator<Object> myIterator;

    transient int size = 0;

    transient Node<E> first;

    transient Node<E> last;

    public TestLinkedListRemoveHelpGC() {
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    private class ListItr implements ListIterator<E> {
        private Node<E> lastReturned;
        private Node<E> next;
        private int nextIndex;
        private int expectedModCount = modCount;

        ListItr(int index) {
            // assert isPositionIndex(index);
            next = (index == size) ? null : node(index);
            nextIndex = index;
        }

        public boolean hasNext() {
            return nextIndex < size;
        }

        public E next() {
            checkForComodification();
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public E previous() {
            checkForComodification();
            if (!hasPrevious())
                throw new NoSuchElementException();

            lastReturned = next = (next == null) ? last : next.prev;
            nextIndex--;
            return lastReturned.item;
        }

        public int nextIndex() {
            return nextIndex;
        }

        public int previousIndex() {
            return nextIndex - 1;
        }

        public void remove() {
            checkForComodification();
            if (lastReturned == null)
                throw new IllegalStateException();

            Node<E> lastNext = lastReturned.next;
            unlink(lastReturned);
            if (next == lastReturned)
                next = lastNext;
            else
                nextIndex--;
            lastReturned = null;
            expectedModCount++;
        }

        public void set(E e) {
            if (lastReturned == null)
                throw new IllegalStateException();
            checkForComodification();
            lastReturned.item = e;
        }

        public void add(E e) {
            checkForComodification();
            lastReturned = null;
            if (next == null)
                linkLast(e);
            else
                linkBefore(e, next);
            nextIndex++;
            expectedModCount++;
        }

        public void forEachRemaining(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            while (modCount == expectedModCount && nextIndex < size) {
                action.accept(next.item);
                lastReturned = next;
                next = next.next;
                nextIndex++;
            }
            checkForComodification();
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

    E unlink(Node<E> x) {
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
        return element;
    }

    void linkBefore(E e, Node<E> succ) {
        // assert succ != null;
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
        modCount++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

    @Override
    public E removeFirst() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return unlinkFirst(f);
    }

    private E unlinkFirst(Node<E> f) {
        // assert f == first && f != null;
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        modCount++;
        return element;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        checkPositionIndex(index);
        return new ListItr(index);
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    public static void main(String[] args) {
        TestLinkedListRemoveHelpGC<Object> myList = new TestLinkedListRemoveHelpGC<>();
//        LinkedList<Object> myList = new LinkedList<>();
        // 构建测试用数组，并测试Book对象的最大存储数量,5394160个对象
        // 构建测试用数组，并测试Book对象的最大存储数量,存入5392160个对象
//        for (int i = 0; i < 5394175; i++) {
        for (int i = 0; i < 5392160; i++) {
            myList.add(new Book("红楼梦", "曹雪芹", 34.6));
        }
        myIterator = myList.listIterator();

        // 先删除1000个首节点
//        for (int i = 0; i < 1000; i++) {
//            myList.removeFirst();
//        }
        // 再添加节点到堆溢出极限值，基本等于一开始测试的极限值5392160。删除1000个，再添加2992个，基本上净增加1992个对象，5392160 + 1992 ≈ 5394160
        // 如果令一个静态变量的Iterator持有首节点的引用，那么所有被删除的节点都不会被回收，因为被外部引用持有。此时溢出净增加极限值 为 1450。净增加极限值减少了 1992-1450=542 个对象。
        // 如果删除1000000次首节点，那么净增加应该减少 542000 个对象, 1992-542000=-540008, 即将增加变为净减少，删除1000000次首节点，只能增加 1000000-540008=459992 个对象。
        // 当然，上面注释的这行只是粗略估算，但是令外部静态变量(myIterator)持有first节点，如果没有unlinkFirst中 f.next = null 这句 help GC,那么毫无疑问会造成LinkedList内部的Node节点对象被前一个Node节点引用，一直到被 myIterator 引用，导致内存无法释放，占有内存，易导致oom堆内存溢出。
//        for (int i = 0; i < 2450; i++) {
//            myList.add(new Book("红楼梦", "曹雪芹", 34.6));
//        }
        for (int i = 0; i < 1000000; i++) {
            myList.removeFirst();
        }
        // 被myIterator外被引用时，实测值：501930 堆溢出
//        for (int i = 0; i < 501930; i++) {
//            myList.add(new Book("红楼梦", "曹雪芹", 34.6));
//        }
        // 取消注释 f.next = null, 实测值：1001940 堆溢出， 明显可以比较出 f.next = null 对释放内存的作用及重要性。
        for (int i = 0; i < 1001940; i++) {
            myList.add(new Book("红楼梦", "曹雪芹", 34.6));
        }
        System.out.println(myList.size());
    }
}

// f.item = null 的作用是 即使有外部引用引用Node1(如Iterator)只要把 f.item = null 引用置空，那么item的生命周期可以保持单链路，与接收removeFirst方法返回值的引用变量的生命周期一致。
// f.next = null 的作用是 即使有外部引用引用Node1(如Iterator)只要把 f.next = null 引用置空，那么后面的一系列Node的生命周期只与list中的first属性有关，Node2的生命周期与first保持一致，当first属性指向下一个节点时，Node2被当成垃圾，Node3的生命周期与first保持一致，以此类推。
// 如果有外部引用Iterator引用首节点，要是源码中没有 f.next = null 或 f.item = null，如果Iterator是静态变量就容易发生内存溢出。这两行代码，帮助GC维护Node对象和item对象引用链路的单一性。