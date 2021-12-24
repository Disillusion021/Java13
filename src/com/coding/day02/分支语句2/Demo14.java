package com.coding.day02.分支语句2;

import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工资：");
        double salary = sc.nextDouble();
        double bouns;
        if (salary <= 2000) {
            bouns = salary * 0.1;
        } else if (salary <= 4000) {
            bouns = salary * 0.2;
        } else if (salary <= 8000) {
            bouns = salary * 0.3;
        } else {
            bouns = salary * 0.4;
        }
        System.out.println("该员工工资为" + salary + "奖金为" + bouns + "元");
    }
}
