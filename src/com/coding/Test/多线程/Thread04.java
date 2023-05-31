package com.coding.Test.多线程;

public class Thread04 {
    public static void main(String[] args) {
        Runnable t1 = () -> {
            int times = 0;
            do {
                System.out.println(Thread.currentThread().getName() + "hello,world" + times++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } while (times != 10);
        };
        Runnable t2 = () -> {
            int times = 0;
            do {
                System.out.println(Thread.currentThread().getName() + "hi" + times++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } while (times != 5);
        };
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
        // 用实现Runnable接口的方式不受制于单继承,还可以给多个线程共用
    }
}
