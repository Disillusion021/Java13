package com.coding.day09.面向对象综合练习_封装_继承;

public class Employee {
    private String name;
    private int age;
    private String position;
    private double salary;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position.equals("售后服务") || position.equals("销售员")) {
            this.position = position;
        } else {
            this.position = "售后服务";
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (age >= 18 && age <= 20) {
            this.salary = salary + 1000;
        } else if (age <= 25) {
            this.salary = salary + 1500;
        } else if (age <= 30) {
            this.salary = salary + 2000;
        } else if (age <= 40) {
            this.salary = salary + 3000;
        } else if (age <= 50) {
            this.salary = salary + 3500;
        } else {
            this.salary = salary + 4000;
        }
    }

    public void showEmployee() {
        if (name.length() > 3) {
            System.out.println(name + "\t" + age + "\t\t" + position + "\t\t" + salary);
        } else {
            System.out.println(name + "\t\t" + age + "\t\t" + position + "\t\t" + salary);
        }
    }
}
