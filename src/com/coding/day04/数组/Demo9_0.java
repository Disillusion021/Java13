package com.coding.day04.数组;

public class Demo9_0 {

    public static void main(String[] args) {
        int[] oldArr = {1,6,3,4,2,0,7,8,5,11,1,5};
        int count1 = 0;
        int count2 = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < oldArr.length; i++) {       //找到oldArr里奇偶的个数，即newArr1和newArr2的长度
            if (oldArr[i] % 2 != 0) {
                count1++;
            } else {
                count2++;
            }
        }
        int[] newArr1 = new int[count1];                //定义奇偶数组
        int[] newArr2 = new int[count2];                //定义奇偶数组
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] % 2 != 0) {
                newArr1[num1] = oldArr[i];
                num1++;
            } else {
                newArr2[num2] = oldArr[i];
                num2++;
            }
        }
        for (int i = 0; i < newArr1.length; i++) {       //输出
            System.out.print(newArr1[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < newArr2.length; i++) {       //输出
            System.out.print(newArr2[i] + "  ");
        }

    }
}
