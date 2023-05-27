package com.coding.Test.泛型;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericDemo4 {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("小0", 9200, null));
        employees.add(new Employee("小1", 9200, null));
        employees.add(new Employee("小2", 9200, null));
        employees.add(new Employee("小王", 9200, new MyDate(6, 15, 1996)));
        employees.add(new Employee("小3", 9200, null));
        employees.add(new Employee("小4", 9200, null));
        employees.add(new Employee("小张", 8200, new MyDate(8, 15, 1996)));
        employees.add(new Employee("小5", 9200, null));
        employees.add(new Employee("小李", 7200, new MyDate(7, 15, 1996)));
        employees.add(new Employee("小6", 9200, null));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o2 == null) {
                    return 1;
                }
                if (o1 == null) {
                    return -1;
                }
                System.out.println(o1.getName());
                System.out.println(o2.getName());
                final MyDate b1 = o1.getBirthday();
                final MyDate b2 = o2.getBirthday();
                if (b2 == null) {
                    return 1;
                }
                if (b1 == null) {
                    return -1;
                }
                int b = 0;
                b = b1.getYear() > b2.getYear() ? b + 4 : b1.getYear() == b2.getYear() ? b : b - 4;
                b = b1.getMonth() > b2.getMonth() ? b + 2 : b1.getMonth() == b2.getMonth() ? b : b - 2;
                b = b1.getDay() > b2.getDay() ? b + 1 : b1.getDay() == b2.getDay() ? b : b - 1;
                return b;
            }
        });
        System.out.println(employees);
    }
}

class Employee {

    private String name;

    private Integer sal;

    private MyDate birthday;

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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee [birthday=" + birthday + ", name=" + name + ", sal=" + sal + "]";
    }

    public Employee(String name, Integer sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

}

class MyDate {

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

    @Override
    public String toString() {
        return "" + day + "/" + month + "/" + year;
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h = 31 * h + day;
        h = 31 * h + month;
        h = 31 * h + year;
        return h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return month == myDate.month && day == myDate.day && year == myDate.year;
    }

}