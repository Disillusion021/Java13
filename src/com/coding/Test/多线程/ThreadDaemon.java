package com.coding.Test.多线程;

// 用户线程和守护线程
// 用户线程: 也叫工作线程,当线程的任务执行完或通知方式结束, e.g. main线程开了一个t1线程,当main线程执行完毕后,t1线程还会继续执行
// 守护线程: 也叫后台线程,当进程中没有用户线程时,守护线程会自动结束
// 常见的守护线程有: 垃圾回收机制
public class ThreadDaemon {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread daemonThread = new MyDaemonThread();
        // 设置为守护线程
        daemonThread.setDaemon(true);
        daemonThread.start();
        Thread.sleep(2000);
        System.out.println("main线程结束"); //所有用户线程结束后,守护线程也会自动结束
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("守护线程一直在运行");
        }
    }
}
