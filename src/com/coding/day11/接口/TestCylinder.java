package com.coding.day11.接口;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args) {
        Circle circle = new CircleImpl();
        Cylinder cylinder = new CylinderImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入半径：");
        double radius = sc.nextDouble();
        double area = circle.getArea(radius);
        System.out.println("底面积为：" + area);
        System.out.println("请输入高：");
        double height = sc.nextDouble();
        System.out.println("圆柱的体积为" + cylinder.getVolume(area, height));
    }
}
