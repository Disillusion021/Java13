package com.coding.Test.泛型;

import java.util.ArrayList;
import java.util.Objects;

public class GenericDemo4Pro {

    public static void main(String[] args) {
        Employeee employee1 = new Employeee();
        employee1.setName("张三");
        employee1.setSal(10000);
        MyDatee myDate = new MyDatee(1996, 6, 15);
        employee1.setBirthday(myDate);
        Employeee employee2 = new Employeee();
        employee2.setName("王三");
        employee2.setSal(10000);
        MyDatee myDate1 = new MyDatee(1996, 6, 15);
        employee2.setBirthday(myDate1);
        Employeee employee3 = new Employeee();
        employee3.setName("张三");
        employee3.setSal(10000);
        MyDatee myDate2 = new MyDatee(1995, 6, 15);
        employee3.setBirthday(myDate2);
        ArrayList<Employeee> employeees = new ArrayList<>();
        employeees.add(employee1);
        employeees.add(employee2);
        employeees.add(employee3);
        employeees.sort((o1, o2) -> {
            if (o1 != null && o2 == null) return 1;
            if (o1 != null) {
                // 首先比较姓名
                if (Objects.equals(o1.getName(), o2.getName())) {
                    // 姓名相同比较生日日期
                    if (o1.getBirthday() != null && o2.getBirthday() == null) return 1;
                    if (o1.getBirthday() != null) return o1.getBirthday().compareTo(o2.getBirthday());
                    return -1;
                }
                if (o1.getName() != null && o2.getName() == null) return 1;
                if (o1.getName() != null) return o1.getName().compareTo(o2.getName());
                return -1;
            }
            return -1;
        });
        System.out.println(employeees);
    }

}

class Employeee {
    private String name;

    private Integer sal;

    private MyDatee birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public MyDatee getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDatee birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDatee implements Comparable<MyDatee> {
    private int month;

    private int day;

    private int year;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDatee() {
    }

    public MyDatee(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDatee another) {
        // 首先比较年份
        if (this.year != another.year) return this.year - another.year;
        // 年份相同比较月份
        if (this.month != another.month) return this.month - another.month;
        // 月份相同比较日期
        return this.day - another.day;
    }
}

