package com.coding.day16;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();
        String password2 = sc.next();
        Operator.register(username, password, password2);
    }
}
