package com.coding.Test.多线程;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// 线程的基本用法
public class Thread1{
    public static void main(String[] args) {
        // 创建Cat对象，可以当做线程使用
        Cat cat = new Cat();
        // 调用run()方法
        // run()方法就是一个普通的方法，要开启新的线程必须要用start()方法。
        // start()方法中的start0()本地方法才是真正的JVM用来开启多线程的方法。
        // 而且start0也只是把线程变成了可运行状态，真正什么时候执行，取决于cpu，由cpu根据操作系统的调度算法统一调度执行。
        cat.start();
        // 输出主线程名
        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 600; i++) {
            System.out.println("主线程 i=" + i);
            // 让主线程休眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        Runnable task = () -> {
            System.out.println("Scheduling: " + System.nanoTime());
        };
        scheduler.schedule(task, 5, TimeUnit.SECONDS);    }
}

// 当一个类继承了Thread类，该类就可以当做线程使用
class Cat extends Thread {

    @Override
    public void run() {
        int times = 0;
        // 重写run方法，写上自己的业务逻辑
        // 该线程每隔1秒。在控制台输出"喵喵，我是小猫咪"
        do {
            System.out.println("喵喵，我是小猫咪" + ++times);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (times != 800);
    }
}