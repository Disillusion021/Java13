package com.coding.Test.多线程;

public class Thread03 {
    public static void main(String[] args) {
        Dog d = new Dog();
        // 创建一个Thread对象，把实现了Runnable的接口传进去，调用start方法开启子线程
        // new Thread(d).start();
        new ThreadProxy(d).start();
        System.out.println(System.getProperty("java.io.tmpdir"));
    }
}

// 代理模式：**相当于我自己(实现了Runnable的Dog类)没有start()方法,我让你(ThreadProxy)帮我来做这个事情start()方法,但是真正干活的还是我(我自己的Run()方法)**
// Thread类其实就是一个代理类，代理了Runnable接口的实现类。
// 创建一个代理类，实现要代理类型要实现的接口
// 定义一个属性，类型为接口类型
// 定义一个有参构造方法，把要代理的具体实现类入参，为属性赋值。
// 在类里面写各种方法，此时这些方法可以使用被代理对象的方法，也可以加入一些自己的代码，代理类可以对被代理类做一些手脚

// 模拟一个线程代理类，代理模式
class ThreadProxy implements Runnable {

    // 定义一个属性，编译类型为Runable接口类型。
    private Runnable target;

    @Override
    public void run() {
        if (target != null) {
            // target.run();
            new Thread(target).start();
        }
    }

    // 一个带参构造方法，传入一个Runable的实现类
    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();
    }

    // 这里就是模拟了一下native start0方法。start0方法
    private void start0() {
        run();
    }
}

class Dog implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while(true) {
            System.out.println("小狗汪汪叫 " + ++count + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}