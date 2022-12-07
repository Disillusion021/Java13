package com.coding.Test.多线程;

public class MultiThreadPlus {
    static int x;
    public static void main(String[] args) {
        RunnerA runnerA = new RunnerA();
        RunnerB runnerB = new RunnerB();
        Thread A = new Thread(runnerA);
        Thread B = new Thread(runnerB);
        A.start();
        B.start();
    }
}

class RunnerA implements Runnable {

    @Override
    public void run() {
        // 1. A线程先读取x = 0
        int y = MultiThreadPlus.x;
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 3. A线程执行第一次x=x+1
        MultiThreadPlus.x = y + 1;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 5. A线程执行后续99次x++
        for (int i = 0; i < 99; i++) {
            MultiThreadPlus.x++;
        }
        System.out.println(Thread.currentThread().getName() + "线程完事了" + "x的值是：" + MultiThreadPlus.x);
    }
}

class RunnerB implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 2. B线程再执行99次x++
        for (int i = 0; i < 99; i++) {
            MultiThreadPlus.x++;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 4. B线程再读取A线程执行过1次++的x值
        int y = MultiThreadPlus.x;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 6. B线程再执行最后一次 x++, 但B线程读取的x值为1, B线程最后会覆盖A线程x的值
        MultiThreadPlus.x = y + 1;
        System.out.println(Thread.currentThread().getName() + "线程完事了" + "x的值是：" + MultiThreadPlus.x);
    }
}
