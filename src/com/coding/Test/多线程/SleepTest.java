package com.coding.Test.多线程;

public class SleepTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是第一个线程");
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        try {
            System.out.println("当前线程是"+Thread.currentThread().getName());
            Thread.sleep(5000);//主线程休息5秒
            System.out.println("当前线程是"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是第二个线程");
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}
// 结论 Thread.sleep是让当前线程挂起。