package com.coding.日期类;

import java.time.LocalDateTime;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        //获取系统当前时间毫秒数，和new Date()默认值是一样的
        System.out.println(System.currentTimeMillis());
        System.out.println(LocalDateTime.now());
    }
}
