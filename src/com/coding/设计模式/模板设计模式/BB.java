package com.coding.设计模式.模板设计模式;

public class BB extends O {
    public void job() {
        int sum = 0;
        for (int i = 0; i < 50000000; i++) {
            sum += i;
        }
    }
}
