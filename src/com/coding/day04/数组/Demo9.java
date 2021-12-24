package com.coding.day04.数组;

public class Demo9 {

    public static void main(String[] args) {
        int[] oldArr = {1,0,3,4,2,0,7,0,5};             //提取老数组不为0的数的个数，即新数组的长度
        int count = 0;
        int num = -1;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0) {
                count++;
            }
        }
        int[] newArr = new int[count];                  //给新数组赋值
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0) {
                num++;
                newArr[num] = oldArr[i];
            }
        }
        for (int i = 0; i < newArr.length; i++) {       //输出
            System.out.println(newArr[i]);
        }
    }
}
