package com.coding.day12.抽象类与接口综合应用;

public class Manager extends Employee {
    private double bonus;

    public Manager() {
        bonus = 8000;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理跟客户谈需求");
    }

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public void adjustSalary(Programmer pe) {
        if (pe.getBugCount() > 200) {
            pe.setSalary(0);
        } else if (pe.getBugCount() > 100) {
            pe.setSalary(pe.getSalary() - pe.getSalary() * (pe.getBugCount() - 100) / 100);
        } else {
            pe.setSalary(pe.getSalary() + pe.getSalary() * (100 - pe.getBugCount()) / 100);
        }
    }

    public void show() {
        System.out.println(getName() + "id为" + getId() + "，工资为" + getSalary() +  "奖金为" + bonus);
    }
}
