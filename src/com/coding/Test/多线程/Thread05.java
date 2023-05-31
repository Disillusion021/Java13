package com.coding.Test.多线程;

/*
    互斥锁
    1. Java中,引入了对象互斥锁的概念,来保证共享操作数据的完整性
    2. 每个对象都对应于一个可称为"互斥锁"的标记,这个标记用来保证在任一时刻,只能有一个线程访问该对象
    3. 关键字synchronized来与对象的互斥锁联系.当某个对象用synchronized修饰时,表明**该对象在*任一时刻*只能有*一个线程*访问**
    4. 当一个线程想要执行synchronized修饰的方法里的代码时,线程首先尝试去拿这把锁,如果能拿到这把锁,那么这个线程就可以执行synchronized修饰的方法里的代码,如果拿不到这把锁,那么这个线程就会不断的尝试去拿这把锁,直到拿到为止,并且是多个线程同时去竞争这把锁
    5. 同步的局限性,会导致程序的执行效率降低
    6. *** 只要保证多个线程锁住的对象是同一个,那么任意对象都可以作为锁对象 ***
 */
public class Thread05 {
    public static int ticketNum = 100; // 让多线程共享 ticketNum

    public static void main(String[] args) {
        // 1. 用继承Thread类的方式
        // 启动多线程断点调试,让多个线程都在ticketNum=1的时候,同时进入while循环,然后都执行--ticketNum,会出现超卖现象,多进去几条线程就会多卖出几张票
        new SellTicketThread().start();
        new SellTicketThread().start();
        new SellTicketThread().start();

        // 2. 用Runnable接口的方式
        // SellTicketRunnable sellTicketRunnable = new SellTicketRunnable();
        // new Thread(sellTicketRunnable).start();
        // new Thread(sellTicketRunnable).start();
        // new Thread(sellTicketRunnable).start();
    }

}

class SellTicketThread extends Thread {
    private static int ticketNum = 100; // 余票

    private static boolean loop = true;

    // 锁对象,跟class对象是一样的,因为多个线程共用一个类,而lock是这个类的静态成员变量,所以也是共用一个.
    private static final Object lock = new Object();

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }

    // 如果用继承Thread的方式,方法也必须是static的,因为每个线程都有一个Thread对象,要同步的话,必须是静态方法
    // 所以,用Runnable的方式更加适合多线程共享资源的情况,因为共用一个Runnable对象
    // 说明:
    // 1. 静态同步方法的锁为当前类本身,即锁在SellTicketThread.class这个对象上
    // 2. 如果在静态方法中,实现一个同步代码快,锁对象可以为当前类本身
    private static /*synchronized*/ void sell() {
        synchronized (/*SellTicketThread.class*/ lock) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                loop = false;
                return;
            }
            System.out.println(Thread.currentThread().getName() + "卖了一张票,剩余票数:" + --ticketNum);
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class SellTicketRunnable implements Runnable {
    private int ticketNum = 100; // 余票

    private boolean loop = true;

    // 锁对象,跟锁this其实一样,因为多个线程共用一个SellTicketRunnable对象,而lock是这个对象的成员变量,所以也是共用一个.
    private final Object lock = new Object();

    @Override
    public void run() {
        while (loop) {
            sellTickets();
        }
    }

    // 说明:
    // 1. public synchronized void sellTickets() {} 就是一个同步方法
    // 2. 同步方法的锁对象是this,即当前对象
    // 3. 也可以在代码快上加锁, 即同步代码快
    public /*synchronized*/ void sellTickets() {
        // 将方法做成同步方法,在判断的时候不会同时判断,因为判断和执行在一个原子操作中
        synchronized (/*this*/lock) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                loop = false;
                return;
            }
            System.out.println(Thread.currentThread().getName() + "卖了一张票,剩余票数:" + --ticketNum);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

