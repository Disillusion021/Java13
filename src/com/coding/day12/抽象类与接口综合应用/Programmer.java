package com.coding.day12.抽象类与接口综合应用;

public class Programmer extends Employee{
    private int bugCount;

    public int getBugCount() {
        return bugCount;
    }

    public void setBugCount(int bugCount) {
        this.bugCount = bugCount;
    }

    public Programmer() {
        bugCount = 0;
    }

    public Programmer(int id, String name, double salary, int bugCount) {
        super(id, name, salary);
        this.bugCount = bugCount;
    }

    @Override
    public void work() {
        System.out.println("码农" + getName() + "按照需求写代码");
    }

    public void show() {
        System.out.println(getName() + "id为" + getId() + "，工资为" + getSalary() +  "，bug数为" + bugCount);
    }
}
