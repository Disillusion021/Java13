package com.coding.day06.方法_返回值;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class m {

    public static int f1(int a) {
        int sum = 0;
        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                sum += i;
            }
            return sum;
        } else {
            return 0;
        }
    }

    public static int f2(int a) {
        int product = 1;
        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                product *= i;
            }
            return product;
        } else {
            return 0;
        }
    }

    public static int f3(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static boolean f4(int[] arr, int num) {
        boolean tag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                tag = true;
            }
        }
        return tag;
    }

    public static boolean f5(String userName, String password) {
        boolean tag = false;
        if (userName.equals("aa123") && password.equals("bb123")) {
            tag = true;
        }
        return tag;
    }

    public static boolean f7(int year, int month, int day) {
        boolean tag = true;
        if (year <= 0) {
            tag = false;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day > 31 || day < 1) tag = false;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 30 || day < 1) tag = false;
                break;
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    if (day > 29 || day < 1) tag = false;
                } else {
                    if (day > 28 || day < 1) tag = false;
                }
                break;
            default:
                tag = false;
        }
        return tag;
    }
// 数组排序算法 falg为true时由小到大，flag为false时由大到小。
    public static int[] f6(int[] arr, boolean flag) {
        if (flag) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1] ) {
                    arr[i] = arr[i + 1] + arr[i];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                    for (int j = i ; j > 0 ; j--) {
                        if (arr[j] < arr[j - 1]) {
                            arr[j] = arr[j - 1] + arr[j];
                            arr[j - 1] = arr[j] - arr[j - 1];
                            arr[j] = arr[j] - arr[j - 1];
                        }
                    }
                }
            }
            return arr;
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1] ) {
                    arr[i] = arr[i + 1] + arr[i];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                    for (int j = i ; j > 0 ; j--) {
                        if (arr[j] < arr[j - 1]) {
                            arr[j] = arr[j - 1] + arr[j];
                            arr[j - 1] = arr[j] - arr[j - 1];
                            arr[j] = arr[j] - arr[j - 1];
                        }
                    }
                }
            }
            return arr;
        }
    }
}
