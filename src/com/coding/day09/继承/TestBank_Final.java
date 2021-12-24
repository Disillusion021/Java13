package com.coding.day09.继承;

import java.util.Scanner;

public class TestBank_Final {
    public static void main(String[] args) {
        ControlBank op = new ControlBank();
        Bank bank;
        do {
            bank = op.bankCreat();
        } while (bank == null);
        op.bankOperate(bank);
    }
}
