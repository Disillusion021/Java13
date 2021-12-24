package com.coding.day12.常用类;

public class Demo15 {

    public static void main(String[] args) {
        String s = "小利爱编程,小利爱唱歌,小利爱跳舞,小利爱撒泼,小利爱吃饭";
        String[] arr = s.split(",");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace("小", "大");
            System.out.println(arr[i].substring(0, i + 1));
        }
    }
}
