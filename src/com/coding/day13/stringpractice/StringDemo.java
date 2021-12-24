package com.coding.day13.stringpractice;

public class StringDemo {

    public static void main(String[] args) {
        String s1 = "I am a boy，I like play game";

        System.out.println(s1.length());

        System.out.println(s1.charAt(11));

        String sub = s1.substring(13, 17);
        char[] char4 = sub.toCharArray();
        for (char c : char4) {
            System.out.println(c);
        }

        System.out.println(s1.substring(18));


        byte[] bytes1 = s1.getBytes();
        System.out.println(bytes1.length);
        for (byte b : bytes1) {
            System.out.print(b + "  ");
        }
        System.out.println();

        char[] x = s1.toCharArray();
        byte[] bytes = new byte[x.length];
        System.out.println(bytes.length);
        for (int i = 0; i < x.length; i++) {
            bytes[i] = (byte) x[i];
            System.out.print(bytes[i] + "  ");
        }
        System.out.println();

        char[] chars = s1.toCharArray();

        System.out.println(s1.endsWith("Game"));

        System.out.println(s1.indexOf('I'));

        System.out.println(s1.lastIndexOf('I'));

        String s2 = s1 + "Do you like？";
        System.out.println(s2);

        String s3 = s1.replace("game", "football");
        System.out.println(s3);

        String s4 = s1.toUpperCase();
        System.out.println(s4);


    }
}
