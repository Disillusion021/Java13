package com.coding.day06.多方法程序设计;

public class Demo5 {

    public static double[] getPass(double... scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                count++;
            }
        }
        double newScores[] = new double[count];
        int num = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                newScores[num] = scores[i];
                num++;
            }
        }
        return newScores;
    }

    public static double getSum(double[] scores) {
        int sum = 0;
        for (double v : scores) {
            sum += v;
        }
        return sum;
    }

    public static void main(String[] args) {
        double[] a = getPass(7, 8, 79, 102, 120, 55, 89, 98, 92);
        for (double v : a) {
            System.out.print(v + "  ");
        }
        System.out.println("成绩及格的学生总成绩为：" + getSum(a));
    }

}
