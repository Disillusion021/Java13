package com.coding.动态绑定机制;

public class A {
        public int i = 10;

        public int sum() {
            return getI() + 10;
        }

        public int sum1() {
            return i + 10;
        }

        public int getI() {
            return i;
        }
}
