package com.coding.day12.常用类;

public class Demo13 {

    public static void main(String[] args) {
        String s = "垂帘画阁画帘垂,谁系怀思怀系谁,影弄花枝花弄影,丝牵柳线柳牵丝,脸波横泪横波脸,眉黛浓愁浓黛眉,永夜寒灯寒灯夜,期归梦还梦归期";
        String[] arr = s.split(",");
        for (int i = arr.length; i > 0; i--) {
            for (int j = arr[i - 1].length(); j > 0; j--) {
                System.out.print(arr[i - 1].charAt(j - 1));
            }
        }
    }
}
