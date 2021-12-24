package com.coding.day10.多态;

import java.util.Scanner;

public class PhoneFactory {
    public void testPhone(Phone p) {
        p.call();
        p.answer();
        if (p instanceof TelePhone) {
            ((TelePhone) p).receiveShortMessage();
        }
        if (p instanceof FixedPhone) {
            ((FixedPhone) p).connectInternet();
        }
    }

    public Phone getPhone(int type) {
        if (type == 1) {
            return new FixedPhone();
        } else if (type == 2) {
            return new TelePhone();
        } else {
            return new Phone();
        }
    }

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要创建的电话类型（1、FixedPhone  2、TelePhone  3、Phone）：");
        int type = sc.nextInt();
        Phone p = phoneFactory.getPhone(type);
        phoneFactory.testPhone(p);
    }
}
