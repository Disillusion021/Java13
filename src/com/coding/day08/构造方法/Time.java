package com.coding.day08.构造方法;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void showTime() {
        if (hour >= 24 || hour < 0 || minute >= 60 || minute < 0 || second >= 60 || second < 0) {
            System.out.println("时间错误");
        } else {
            System.out.println("现在的时间是" + hour + "时" + minute + "分" + second + "秒");
        }
    }
}
