package com.coding.day07.数据结构与算法;

public class Demo1 {

    /*  海滩上有一堆桃子，五只猴子来分，第一只猴子将这堆桃子平均分成5份，但是多了一个，于是这只猴子将多余的一个扔到海中，并拿走了其中的一份桃子
        第二只猴子把剩下的所有桃子重新平均分成了5份，又多了一个，于是扔到了海里，并拿走了其中的一份
        第三只、第四只、第五只猴子依次重复上述的动作，直到第五只猴子将桃子平均分成5份，扔一个到海里，最终拿走了其中的一份。
        请问，这堆桃子最少有多少个？ */

    //我想正向用遍历解题，因此自定义了一个正向分桃子的方法dividePeaches,返回每次分完后剩余的桃子,若不能均分则返回-1.
    public static int dividePeaches(int peaches) {
        peaches = peaches - 1;
        if (peaches % 5 == 0){
            peaches = peaches / 5 * 4;
        } else {
            peaches = -1;
        }
        return peaches;
    }

    public static void main(String[] args) {
        //正向遍历暴力破解，分5次后再做判断
        for (int i = 0; ; i++) {
            int peaches = i;
            for (int j = 1; j <= 5 ; j++) {
                if( peaches != -1) {
                    peaches = dividePeaches(peaches);
                }
            }
            //循环五次dividePeaches后剩余的桃，-1后不能再被5整除，此时循环结束，输出这堆桃子的最小值
            if (peaches != -1 && (peaches - 1) % 5 != 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
