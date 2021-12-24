package com.coding.day05.方法_参数;

public class m {

    //求闰年
    public static void f1(int year) {
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? year + "年是闰年" : year + "年不是闰年");
    }

    //求停车费
    public static void f2(double hour) {
        double money = 0;
        money = 3 * Math.ceil(hour);
        if (money >= 30) {
            money = 30;
        }
        System.out.println(money);
    }

    //求编程工资
    public static void f3(int line, int bug) {
        double money = 0;
        if (line > 4000) {
            money += line * 2.5 - 2000;
        } else {
            money += line * 2;
        }
        if (bug <= 20) {
            money -= bug * 10;
        } else {
            money -= 200;
            for (int i = 21; i <= bug; i++) {
                money -= i - 10;
            }
        }
        System.out.println(money);
    }

    //计算最终血量
    public static void f4(int blood) {
        double bloodVolume = 100;
        for (int i = 1; i <= blood; i++) {
            bloodVolume += 100 * Math.pow(0.8, i - 1);
        }
        System.out.println("剩余血量为：" + bloodVolume);
    }

    //输出参数数组中的最大值
    public static void f5(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);
    }

    //三个数由小到大排序
    public static void f6(int a, int b, int c) {
        int max = a;
        int min = a;
        int mid = a;
        if (b > max) {
            max = b;
        }
        if (b < min) {
            min = b;
        }
        if (c > max) {
            max = c;
        }
        if (c < min) {
            min = c;
        }
        mid = a + b + c - max - min;
        System.out.println(min + "  " + mid + "  " + max);
    }

    //商品总价计算
    public static void f7(double price, int number) {
        double totalPrice = 0;
        if (number < 2) {
            totalPrice = price * number;
        } else if (number <= 5) {
            totalPrice = price * number * 0.9;
        } else if (number <= 10) {
            totalPrice = price * number * 0.8;
        } else {
            totalPrice = price * number * 0.5;
        }
        System.out.println("顾客消费：" + totalPrice);
    }

    //求任意一点距离原点的距离
    public static void f8(double x, double y) {
        double distance = 0;
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("该点距原点的距离为：" + distance);
    }

    //判断登录是否成功
    public static void f9(String account, String password) {
        System.out.println(account.equals("aa123") && password.equals("bb123") ? "登录成功" : "登录失败");
    }
}

