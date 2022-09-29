package com.coding.Test.多线程;
public class Thread02 {
    // 测试多线程共享变量的可见性问题
    // 如果不加volatile关键字，也不加synchronized锁。那么子线程会一直从cpu2的高速缓存里读取j变量，主线程虽然将j=1写入到了内存中，子线程也不会读取到。
    // 当切换栈帧后，子线程貌似会重新把内存同步给高速缓存。
    // 如果加volatile，那j变量会一直从内存中读取，所以子线程也会可见主线程对j变量修改后的值。
    // 如果加synchronized，
    // 那么在加锁时，会清空当前线程的工作内存，然后从主内存中拷贝共享变量的最新值到工作内存；
    // 在解锁时将清空工作内存中共享变量的值，从而使用共享变量时需要从主内存中重新读取最新的值（注意：加锁与解锁需要是同一把锁）
    public static Integer j = 0;
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                int i=0;
                while(true) {
                    synchronized(j) {
                        while(j>i) {
                            System.out.println(1111);
                        }
                    }
                }
            };
        }.start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        j=1;
        System.out.println(j);
    }

}
