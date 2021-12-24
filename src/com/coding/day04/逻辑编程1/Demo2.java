package com.coding.day04.逻辑编程1;

import java.util.Scanner;
//T2 和 2_0其实代码同理，不过一个使用数组元素本身是否为0做判断，另一个直接使用布尔型数组。
/*  灯开关这道题，也可以按灯做循环思考，第一盏灯开一次，第二盏灯开1，2两次，第四盏灯开，1，2，4三次，第6盏灯开1，2，3，6四次，都开公因数次！因此公因数为奇数次等，在公因数全循环晚时，灯状态为开。
    故只有平方数公因数为奇数个，所以全循环完后剩下还亮着（奇数）的灯只有灯号是平方数的。不过这只是个特解，也没啥的。*/
public class Demo2 {

    public static void main(String[] args) {
        int[] lightnum = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要瞎几把按开关多少轮：");
        int n = sc.nextInt();   //代码兼容性好，我想看第几轮灯状态就能看第几轮
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 100; j++) {
                if (j % i == 0) {
                    if (lightnum[j - 1] == 0) {   //利用数组元素本身是否等于0来做判断
                        lightnum[j - 1] = j;
                    } else {
                        lightnum[j - 1] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < lightnum.length; i++) {
            if (lightnum[i] != 0) {
                System.out.print(lightnum[i] + "  ");
            }
        }
    }
}
