package com.coding.Test.多线程;

// 主动通知线程退出
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        R target = new R();
        new Thread(target).start();
        Thread.sleep(10000);
        // 10秒后终止线程
        // 通过修改loop变量通知线程退出
        target.setLoop(false);
    }
}

class R implements Runnable {

    private int i = 0;

    // 设置一个控制线程终止的标志
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Running" + " - " + i++);
        }
    }

}

