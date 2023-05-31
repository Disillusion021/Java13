package com.coding.Test.多线程;

/**
 * count++和count--操作并不是原子性的
 */
// `count++`和`count--`操作并不是原子性的，因为它们实际上是由多个步骤组成的。
// 1. 读取`count`的当前值。
// 2. 将读取的值加1（`count++`）或减1（`count--`）。
// 3. 将修改后的值写回`count`变量。
//
// 这些步骤在多线程环境中是不可分割的，因此在并发情况下可能会发生竞态条件。
// 例如，考虑以下情况：
// 1. 线程A读取`count`的值为10。
// 2. 在线程A将10加1之前，线程B读取了`count`的值为10。
// 3. 线程A将10加1，得到11。
// 4. 线程B将10减1，得到9。
// 5. 线程A将11写回`count`。
// 6. 线程B将9写回`count`。
// 在这种情况下，两个线程对`count`的操作交错进行，最终导致`count`的值不是预期的0。

// 并且不可以用synchronized(count),因为Integer是不可变对象,每次++,--都会创建一个新的对象,而多线程锁对象必须是一个才能锁住
// 因此可以用synchronized(object),解决这个问题

public class PlusMinusDemo {
    // 只要保证自始至终是一个对象就行,final是idea的贴心提示
    static /*final*/ Object object = new Object();
    static Integer count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    synchronized (object){
                        count++;
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    synchronized (object){
                        count--;
                    }
                }
            }
        });

        t1.start();
        t2.start();
        // 主线程等待t1和t2执行完成，再执行下面的代码
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
