package com.coding.day04.数组;

import java.util.Scanner;

public class Demo11 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] count = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {                              //录入数组
            System.out.println("请输入第" + (i + 1) + "个整数（1~5）");
            arr[i] = sc.nextInt();
            if (arr[i] > 5 || arr[i] < 1 ) {
                System.out.println("录入有误，请重试");
                i--;
                continue;
            }
            switch (arr[i]) {                                               //统计数组中各个数字出现的次数，存入count数组中
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
                case 4:
                    count[3]++;
                    break;
                case 5:
                    count[4]++;
                    break;
            }
        }
        String abc = "";
        int num = 0;
        for (int i = 0; i < 5 ; i++) {                                              //输出出现了几种数字，出现了哪几种数字
            if (count[i] != 0){
                num++;
                if (i == 4) {
                    abc += (i+1);
                } else {
                    abc += ((i+1) + ", ");
                }
            }
        }
        System.out.println("数组中出现的数字共有" + num +"种，分别是：" + abc);
        for (int i = 1; i <= 5 ; i++) {                                             //输出count数组
            System.out.println("数字" + i + "出现的次数为：" + count[i-1]);
        }
    }
}
