package com.coding.日期类;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        //把时间对象按照“格式字符串指定的格式”转成相应的字符串
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = df.format(new Date(400000000));
        System.out.println(str);

        //把字符串按照“格式字符串指定的格式"转成相应的时间对象
        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date date = df2.parse("1996年06月15日 10时06分15秒");
        System.out.println(date);
        System.out.println(date.getTime());

        //测试其他格式字符。比如：利用D，获得本时间对象所处年份的第几天
        DateFormat df3 = new SimpleDateFormat("D");
        String str3 = df3.format(new Date());
        System.out.println(str3);
    }


}
