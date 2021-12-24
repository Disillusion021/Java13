package com.coding.day06.多方法程序设计;
/*
附加程序：向数组中添加非0数字，循环接受用户输入非0数字，并添加到数组中，重复元素不可以添加，具体要求如下：
        1）创建自定义方法public static int find(int arr[],int num)：用于查找num在arr数组中是否存在，如果存在，返回该数在数组中的位置，若不存在，则返回-1
        2）创建自定义方法public static int insert(int arr[],int num): 用于向arr数组中添加num元素，通过循环在arr数组中查找第一个为0的元素，将num的值添加到该位置，并返回添加成功之后的角标，如果找不到为0的数字，则返回-1，代表数组已满，不可以再插入。
        3）在main方法中创建长度为10的整数数组。
        4）main方法中接受用户从键盘输入一个数字
        i.	如果是0，则提示错误并重新输入；
        ii.	如果不是0，则调用自定义方法find(),查找该数在数组中是否存在；
        1.	如果存在，则提示该数已存在，不可以向数组中插入，然后询问用户是否继续输入下一个数
        2.	如果不存在，则调用自定义方法insert()，向数组中添加此数，添加成功询问用户是否继续输入下一个元素，直到用户不想再输入或者数组已满，则停止循环
        5）main方法中输出添加结束之后的数组中的数据
*/

import java.util.Scanner;

public class Demo7 {
    //查找num在arr[]中是否存在，若存在返回其在数组中的索引位置flag，不存在则返回-1。
    public static int find(int arr[], int num) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                flag = i;
                break;
            } else {
                flag = -1;
            }
        }
        return flag;
    }

    //在arr数组中查找第一个为0的元素，将num的值添加到该位置，并返回索引，如果找不到为0的数字，返回-1代表数组已满，不可再插入。
    public static int insert(int arr[], int num) {
        int insertFlag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = num;
                insertFlag = i;
                break;
            } else {
                insertFlag = -1;
            }
        }
        return insertFlag;
    }

    public static void main(String[] args) {
        int[] arr = {0, 20, 8, 7, 1, 0, 3, 0, 7, 0};
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("请输入一个数字：");
            int num = sc.nextInt();
            for (; num == 0; ) {
                System.out.println("输入错误，请重新输入：");
                num = sc.nextInt();
            }
            if (find(arr, num) != -1) {
                System.out.println("该数在数组中已存在，位置为arr[" + find(arr, num) + "]，不可再向数组中插入");
                System.out.println("是否要输入下一个数（继续--【Y】  终止--【N】）");
                String add = sc.next();
                if (!add.equals("Y")) {
                    break;
                }
            } else {
                if (insert(arr,num) != -1) {
                    System.out.println("添加成功，请问是否要继续添加（继续--【Y】  终止--【N】）");
                    String add = sc.next();
                    if (!add.equals("Y")) {
                        break;
                    }
                } else {
                    System.out.println("数组已满,不可再插入，插入无效");
                    break;
                }
            }
        }
        System.out.print("最终数组为：");
        for (int i : arr) {
            System.out.print(i + "  ");
        }

    }

}
