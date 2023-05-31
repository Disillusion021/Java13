package com.coding.Test.多线程;

public class ThreadDeadLock {
    public static void main(String[] args) throws InterruptedException {
        DeadLockThread thread1 = new DeadLockThread(true);
        DeadLockThread thread2 = new DeadLockThread(false);
        thread1.start();
        thread2.start();
    }
}

class DeadLockThread extends Thread {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();
    private boolean flag;
    public DeadLockThread(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (lock1) { // 获得lock1
                System.out.println("if lock1");
                synchronized (lock2) { //需要lock2,尝试获取,获取不到,就会Blocked
                    System.out.println("if lock2");
                }
            }
        } else {
            synchronized (lock2) { // 获得lock2
                System.out.println("else lock2");
                synchronized (lock1) { // 需要lock1,尝试获取,获取不到,就会Blocked
                    System.out.println("else lock1");
                }
            }
        }
    }

}
