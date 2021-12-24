package com.coding.Test.异常;

public class SanMu {
    public static void main(String[] args) {
        //三目类型是一个整体，有Integer和Double同时出现的情况下，类型跟大的走，也就是跟Double走
        Object obj = true ? new Integer(1):new Double(2.0);
        System.out.println(obj);
    }
}
