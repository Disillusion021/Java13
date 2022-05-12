package com.coding.Test.StringTest;

public class TestBufferBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int j=0;j<10;j++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<100;i++){
                        stringBuilder.append("2");
                    }
                }
            }).start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder.length());
    }
}