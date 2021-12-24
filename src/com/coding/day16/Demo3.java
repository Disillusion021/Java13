package com.coding.day16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入第" + (i + 1) + "个整数：");
                int a = sc.nextInt();
                arr[i] = a;
                System.out.println("是否继续输入下一个整数[y-继续]");
                String choose = sc.next();
                if (!choose.equals("y")) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("格式无效，请输入整数");
                sc.next();
                i--;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("数组已满，无法继续存储");
                break;
            }
            i++;
        }
        System.out.println("数组中5个整数如下");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
