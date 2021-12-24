package com.coding.day12.常用类;

import java.util.Scanner;

public class Demo18_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段英文文本（只含空格不含标点符号）：");
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length(); j > 0 ; j--) {
                System.out.print(arr[i].charAt(j - 1));
            }
            if (i != arr.length -1) {
                System.out.print(" ");
            }
        }
    }
}
