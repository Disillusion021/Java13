package com.coding.day05.数组进阶;

import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] deposit = new int[10];                        // 定义deposit数组存储票号
        for (int i = 0; i < deposit.length; i++) {
            System.out.println("请投票（选票编号为1-5）：");
            int num = sc.nextInt();
            if ( num > 5 || num < 1 ) {
                System.out.println("投票无效,请重新投票");
                i--;
            } else {
                deposit[i] = num;
            }
        }
        for (int i = 0; i < deposit.length; i++) {          //输出了一下票号，可以不输出
            System.out.print(deposit[i] + "  ");
        }
        System.out.println();
        int[] ticket = new int[6];                          //定义ticket数组用来存储每位候选人的唱票数，ticket索引号与票号一致时，票数加1。
        for (int i = 0; i < deposit.length; i++) {
            ticket[deposit[i]]++;
        }
        int max = ticket[1];                                //假定最多票数为ticket[1],为了和后面几位候选人的票数比较大小。
        int tag = 1;                                        //定义tag为唱票数最多的候选人，假定为1号候选人。
        for (int i = 1; i < ticket.length; i++) {
            System.out.println("第" + i + "位候选人的票数为：" + ticket[i]);  //输出各位候选人的票数
            if (ticket[i] > max) {
                max = ticket[i];                            //票数比多少，把票数最多的候选人编号赋值给tag
                tag = i;
            }
        }
        System.out.println("最终第" + tag + "位候选人当选了班长");  //票数相同时懒得管了，具体问题具体分析吧
    }
}
