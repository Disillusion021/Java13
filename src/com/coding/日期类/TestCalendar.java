package com.coding.日期类;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
//        Calendar c = new GregorianCalendar(2021,11,23,8,8,8);
//        c.set(Calendar.YEAR,99999);
//        System.out.println(c.get(Calendar.YEAR));
//        System.out.println(c.get(Calendar.DAY_OF_WEEK));
//        //想知道100天以后是什么时间
//        c.add(Calendar.DATE, 100);
//        System.out.println(c);
//        System.out.println(c.get(Calendar.DATE));
//        //日期类和时间类的相互转化
//        Date d = c.getTime();
//        Calendar c2 = new GregorianCalendar();
//        c2.setTime(new Date());
        printCalendar(new GregorianCalendar());
    }

    //打印：2021年11月23日 11:23:23 周三
    public static void printCalendar(Calendar c) {
        c.set(2021,11,23,11,23,23);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR);
        int min = c.get(Calendar.MINUTE);
        int sec = c.get(Calendar.SECOND);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "年" + month + "月" + date + "日" + hour + "时" + min + "分" + sec + "秒" + " 周" + (week == 7 ? "日" : week));
    }
}
