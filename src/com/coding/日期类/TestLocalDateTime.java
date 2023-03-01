package com.coding.日期类;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());
        // 格式化日期输出格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        System.out.println(dateTimeFormatter.format(ldt));
        // 第三代日期类还有一个类 叫 Instant 时间戳， 类似于第一代日期类 Date
        // Instant -> Date
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        // Date -> Instant
        Instant instant = date.toInstant();

        // LocalDate -> LocalDateTime -> 
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fixDate = LocalDate.parse("2022-08-08", fmt);
        long attDate = fixDate.atStartOfDay().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println("LocalDate转换成的时间戳为:" + attDate);
    }
}
