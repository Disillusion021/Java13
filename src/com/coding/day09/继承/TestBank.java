package com.coding.day09.继承;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择对应的银行：1. 建设银行   2. 工商银行   3. 中国银行");
            int choose = sc.nextInt();
            if (choose == 1) {
                CCBBank ccbBank = new CCBBank();
                while (true) {
                    System.out.println("欢迎进入建设银行，请选择相关业务：1. 开户   2. 修改密码   3. 登陆   4. 退出系统");
                    int choose1 = sc.nextInt();
                    if (choose1 == 1) {
                        System.out.println("请输入开户账号：");
                        String userName = sc.next();
                        System.out.println("请输入开户密码：");
                        String password = sc.next();
                        System.out.println("请再次输入开户密码：");
                        String confirmPassword = sc.next();
                        System.out.println(ccbBank.createAccount(userName, password, confirmPassword)?"开户成功":"开户失败，请重新选择相关业务");
                    }
                    if (choose1 == 2) {
                        System.out.println("请输入账号：");
                        String userName = sc.next();
                        System.out.println("请输入原密码：");
                        String password = sc.next();
                        System.out.println("请输入修改后的密码：");
                        String newPassword = sc.next();
                        System.out.println(ccbBank.updatePassword(userName, password, newPassword)?"修改成功":"修改失败，请重新选择相关业务");
                    }
                    if (choose1 == 3) {
                        while (true) {
                            System.out.println("请输入账号：");
                            String userName = sc.next();
                            System.out.println("请输入密码：");
                            String password = sc.next();
                            if (ccbBank.login(userName, password)) {
                                System.out.println("登陆成功");
                                while (true) {
                                    System.out.println("欢迎进入存取款业务，请选择：1. 存钱   2. 取钱   3. 显示余额   4. 退出系统");
                                    int choose2 = sc.nextInt();
                                    if (choose2 == 1) {
                                        System.out.println("请输入存钱数额：");
                                        double money = sc.nextInt();
                                        System.out.println(ccbBank.saveMoney(money)?"存款成功":"数额有误，请重新选择");
                                    } else if (choose2 == 2) {
                                        System.out.println("请输入取钱数额：");
                                        double money = sc.nextInt();
                                        System.out.println(ccbBank.getMoney(money)?"取钱成功，扣除手续费" + money * 0.01 + "元":"取钱失败，银行卡余额不足");
                                    } else if (choose2 == 3) {
                                        ccbBank.showMoney();
                                    } else if (choose2 == 4) {
                                        System.out.println("退出成功，感谢您的使用");
                                        return;
                                    } else {
                                        System.out.println("输入错误，请重试");
                                    }
                                }
                            } else {
                                System.out.println("登录失败，请重试");
                            }
                        }
                    }
                    if (choose1 == 4) {
                        System.out.println("退出成功，感谢您的使用");
                        return;
                    }
                    if (choose1 < 1 || choose1 > 4) {
                        System.out.println("输入错误，请重试");
                    }
                }
            } else if (choose == 2) {
                ICBCBank icbcBank = new ICBCBank();
                while (true) {
                    System.out.println("欢迎进入工商银行，请选择相关业务：1. 开户   2. 修改密码   3. 登陆   4. 退出系统");
                    int choose1 = sc.nextInt();
                    if (choose1 == 1) {
                        System.out.println("请输入开户账号：");
                        String userName = sc.next();
                        System.out.println("请输入开户密码：");
                        String password = sc.next();
                        System.out.println("请再次输入开户密码：");
                        String confirmPassword = sc.next();
                        System.out.println(icbcBank.createAccount(userName, password, confirmPassword)?"开户成功":"开户失败，请重新选择相关业务");
                    }
                    if (choose1 == 2) {
                        System.out.println("请输入账号：");
                        String userName = sc.next();
                        System.out.println("请输入原密码：");
                        String password = sc.next();
                        System.out.println("请输入修改后的密码：");
                        String newPassword = sc.next();
                        System.out.println(icbcBank.updatePassword(userName, password, newPassword)?"修改成功":"修改失败，请重新选择相关业务");
                    }
                    if (choose1 == 3) {
                        while (true) {
                            System.out.println("请输入账号：");
                            String userName = sc.next();
                            System.out.println("请输入密码：");
                            String password = sc.next();
                            if (icbcBank.login(userName, password)) {
                                System.out.println("登陆成功");
                                while (true) {
                                    System.out.println("欢迎进入存取款业务，请选择：1. 存钱   2. 取钱   3. 显示余额   4. 退出系统");
                                    int choose2 = sc.nextInt();
                                    if (choose2 == 1) {
                                        System.out.println("请输入存钱数额：");
                                        double money = sc.nextInt();
                                        System.out.println(icbcBank.saveMoney(money)?"存款成功":"数额有误，请重新选择");
                                    } else if (choose2 == 2) {
                                        System.out.println("请输入取钱数额：");
                                        double money = sc.nextInt();
                                        System.out.println(icbcBank.getMoney(money)?"取钱成功，扣除手续费" + money * 0.005 + "元":"取钱失败，银行卡余额不足");
                                    } else if (choose2 == 3) {
                                        icbcBank.showMoney();
                                    } else if (choose2 == 4) {
                                        System.out.println("退出成功，感谢您的使用");
                                        return;
                                    } else {
                                        System.out.println("输入错误，请重试");
                                    }
                                }
                            } else {
                                System.out.println("登录失败，请重试");
                            }
                        }
                    }
                    if (choose1 == 4) {
                        System.out.println("退出成功，感谢您的使用");
                        return;
                    }
                    if (choose1 < 1 || choose1 > 4) {
                        System.out.println("输入错误，请重试");
                    }
                }
            } else if (choose == 3) {
                ChinaBank chinaBank = new ChinaBank();
                while (true) {
                    System.out.println("欢迎进入中国银行，请选择相关业务：1. 开户   2. 修改密码   3. 登陆   4. 退出系统");
                    int choose1 = sc.nextInt();
                    if (choose1 == 1) {
                        System.out.println("请输入开户账号：");
                        String userName = sc.next();
                        System.out.println("请输入开户密码：");
                        String password = sc.next();
                        System.out.println("请再次输入开户密码：");
                        String confirmPassword = sc.next();
                        System.out.println(chinaBank.createAccount(userName, password, confirmPassword)?"开户成功":"开户失败，请重新选择相关业务");
                    }
                    if (choose1 == 2) {
                        System.out.println("请输入账号：");
                        String userName = sc.next();
                        System.out.println("请输入原密码：");
                        String password = sc.next();
                        System.out.println("请输入修改后的密码：");
                        String newPassword = sc.next();
                        System.out.println(chinaBank.updatePassword(userName, password, newPassword)?"修改成功":"修改失败，请重新选择相关业务");
                    }
                    if (choose1 == 3) {
                        while (true) {
                            System.out.println("请输入账号：");
                            String userName = sc.next();
                            System.out.println("请输入密码：");
                            String password = sc.next();
                            if (chinaBank.login(userName, password)) {
                                System.out.println("登陆成功");
                                while (true) {
                                    System.out.println("欢迎进入存取款业务，请选择：1. 存钱   2. 取钱   3. 显示余额   4. 退出系统");
                                    int choose2 = sc.nextInt();
                                    if (choose2 == 1) {
                                        System.out.println("请输入存钱数额：");
                                        double money = sc.nextInt();
                                        System.out.println(chinaBank.saveMoney(money)?"存款成功":"数额有误，请重新选择");
                                    } else if (choose2 == 2) {
                                        System.out.println("请输入取钱数额：");
                                        double money = sc.nextInt();
                                        System.out.println(chinaBank.getMoney(money)?"取钱成功，扣除手续费" + money * 0.008 + "元":"取钱失败，银行卡余额不足");
                                    } else if (choose2 == 3) {
                                        chinaBank.showMoney();
                                    } else if (choose2 == 4) {
                                        System.out.println("退出成功，感谢您的使用");
                                        return;
                                    } else {
                                        System.out.println("输入错误，请重试");
                                    }
                                }
                            } else {
                                System.out.println("登录失败，请重试");
                            }
                        }
                    }
                    if (choose1 == 4) {
                        System.out.println("退出成功，感谢您的使用");
                        return;
                    }
                    if (choose1 < 1 || choose1 > 4) {
                        System.out.println("输入错误，请重试");
                    }
                }
            } else {
                System.out.println("输入错误，请重试");
            }
        }
    }
}
