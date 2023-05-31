package com.coding.Test.多线程;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new T());
        System.out.println(thread.getName() + " 状态 " + thread.getState());
        thread.start();

        int i = 0;
        while(thread.getState() != Thread.State.TERMINATED) {
            System.out.println(thread.getName() + " 状态 " + thread.getState());
            if (i++ == 9) {
                thread.interrupt();
            }
            Thread.sleep(1000);
        }
        System.out.println(thread.getName() + " 状态 " + thread.getState());
    }
}

class T implements Runnable {

    @Override
    public void run() {
        int i = 0;
        boolean loop = true;
        while (loop) {
            System.out.println("hi " + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                J j = new J();
                j.start();
                try {
                    j.join(); // 线程插队, T线程状态变为WAITING
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                loop = false;
            }
        }
        System.out.println("线程退出");
    }
}

class J extends Thread {
    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println("线程插队  " + j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
