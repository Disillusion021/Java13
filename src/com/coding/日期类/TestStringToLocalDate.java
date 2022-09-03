package com.coding.日期类;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestStringToLocalDate {
    public static void main(String[] args) {
        String t2s = "2022-02-01";
        String t1s = "2022-01-01";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // String to LocalDate
        LocalDate t3 = LocalDate.parse(t1s);
        LocalDate t2 = LocalDate.parse(t2s, fmt);
        LocalDate t1 = LocalDate.parse(t1s, fmt);
        t2 = t2.minusDays(31);
        System.out.println(t2);
        // compareTo返回t2-t1
        System.out.println(t2.compareTo(t1));
        System.out.println(t2.isEqual(t1));
        System.out.println(t3);
    } 

}
