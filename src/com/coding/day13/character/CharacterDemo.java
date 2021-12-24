package com.coding.day13.character;

public class CharacterDemo {
    public static void main(String[] args) {
        String s = "Today is 2011-8-4，sky is blue，grass is green";
        char[] chars = s.toCharArray();
        int up = 0;
        int low = 0;
        int num = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                num++;
            }
            if (Character.isLowerCase(c)) {
                low++;
            }
            if (Character.isUpperCase(c)) {
                up++;
            }
        }
        System.out.println("大写英文字母有" + up + "个");
        System.out.println("小写英文字母有" + low + "个");
        System.out.println("数字有" + num + "个");
    }

}
