package com.coding.Test.多线程;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("老大吃包子" + " - " + i);
            }
        });

        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            if (i == 5) {
                // join()方法会阻塞当前线程,等待被调用线程执行完毕后再继续执行
                // 小弟吃5个包子后,让老大先吃,等老大吃完小弟再吃
                System.out.println("小弟(main线程)让老大(thread线程)先吃");
                thread.start();
                thread.join();
            }
            System.out.println("小弟吃包子" + " - " + i);
        }

    }
}
