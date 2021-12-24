package com.coding.day14.集合_List1;

import java.util.ArrayList;
import java.util.List;

public class T2 {

/*
    创建T2类，定义main方法，创建整数数组int[] arr = {2, 1, 0, 6, 0, 9, 7, 0, 0, 3}
    接着创建List集合，要求将数组中不为0的数据装入集合中，最终输出集合的数据
*/

    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 6, 0, 9, 7, 0, 0, 3};
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i != 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
