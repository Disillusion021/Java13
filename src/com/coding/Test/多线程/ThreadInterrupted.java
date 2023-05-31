package com.coding.Test.多线程;

import org.junit.jupiter.api.Test;

// 中断线程是指向线程发送一个中段信号,收到信号后由线程自己来判断如何处理
public class ThreadInterrupted {

    // 当线程处于阻塞状态时,调用线程的interrupt()方法会抛出一个InterruptedException异常
    @Test
    public void testInterrupt1() throws InterruptedException {
        Thread thread = new Thread(new RR());
        thread.setName("disillusion");
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Hi~~~");
        }
        thread.interrupt();
    }

    // 当线程处于运行状态时,调用线程的interrupt()方法,线程的中断标志会被置为true,但是线程不会终止,线程通过isInterrupted()方法来判断是否被中断,从而决定如何处理
    // 并且当程序处于运行状态时,线程收的中段标志被置为true后,线程再次调用sleep()方法时,会抛出一个InterruptedException异常,并且中断标志会被清除,重新置为false
    public static void main(String[] args)  throws InterruptedException {
        Thread thread = new Thread(new RR());
        thread.setName("disillusion");
        thread.setPriority(Thread.MAX_PRIORITY); // 调整线程的优先级为最高,可以让线程多吃一会儿包子
        thread.start();
        Thread.sleep(1); // 让线程先吃一会儿包子,然后再被中断
        System.out.println("Hi~~~");
        thread.interrupt();
    }

}

 class RR implements Runnable {

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 1000; i++) {
                // Thread.currentThread().isInterrupted()不会改变线程的中段标志,只是返回当前线程的中断标志
                // Thread.interrupted()会清除线程的中断标志true,使线程的中段标志重新置为false
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("线程被中断了~~~ " + i);
                } else {
                    System.out.println(Thread.currentThread().getName() + " 吃包子~~~ " + i);
                }
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中~~~");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被interrupt了~~~");
            }
        }
    }
}
