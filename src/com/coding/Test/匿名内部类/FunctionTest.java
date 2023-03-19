package com.coding.Test.匿名内部类;

import java.util.function.Consumer;

public class FunctionTest {
    public static void consumer(Consumer<Integer> consumer, Integer n) {
        consumer.accept(n);
    }

    public static void main(String[] args) {
        consumer(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n + 1);
            }
        }.andThen(n -> System.out.println(n + 2)), 1);
        consumer(n -> System.out.println(n + 1), 2);
        consumer(((Consumer<Integer>) n -> System.out.println(n + 1)).andThen(n -> System.out.println(n + 2)), 1);
    }
}
