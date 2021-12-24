package com.coding.day03.循环;

public class Demo21 {
    public static void main(String[] args) {
        int count = 0;
        int z = 1;
        while (z <= 1000) {
            if (z % 5 == 0) {
                System.out.print(z + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
            z++;
        }
    }

}
