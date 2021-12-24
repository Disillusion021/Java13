package com.coding.Test;

public class Tests {
    //对数组和引用变量的理解
    public static void main(String[] args) {
        int[] nums = new int[3];
        System.out.println(nums);
        System.out.println(nums[0]);
        System.out.println(nums[1]);


        Person[] ps = new Person[3];
        System.out.println(ps);
        ps[0] = new Person();
        ps[1] = new Person();
        System.out.println(ps[0]);
        System.out.println(ps[1]);
        Person p = new Person();
        System.out.println(p);
        ps[2] = p;
        System.out.println(ps[2]);
        ps[2].age = 25;
        System.out.println(p.age);
        System.out.println(ps[2].age);
        p.age = 24;
        System.out.println(p.age);
        System.out.println(ps[2].age);
    }
}
