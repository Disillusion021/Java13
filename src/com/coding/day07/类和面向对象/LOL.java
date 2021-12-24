package com.coding.day07.类和面向对象;

import java.util.Scanner;

public class LOL {

    public static void main(String[] args) {
        Hero yasuo = new Hero();
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到英雄联盟！");
        for (; ; ) {
            System.out.println("请选择：1. 购买装备 2. 打野 3. 清扫战场 4. 显示英雄信息 5. 结束游戏");
            int choose1 = sc.nextInt();
            //购买装备
            if (choose1 == 1) {
                System.out.println("请选择购买的装备：1. 移速类 2. 攻击类 3. 护甲类 4.血量类");
                int choose2 = sc.nextInt();
                //购买移速类装备
                if (choose2 == 1) {
                    System.out.println("请选择购买的装备：1. 速度之靴 2. 疾行之靴");
                    int choose3 = sc.nextInt();
                    if (choose3 == 1) {
                        yasuo.equip("速度之靴");
                        System.out.println("恭喜你，购买成功");
                    }
                    if (choose3 == 2) {
                        yasuo.equip("疾行之靴");
                        System.out.println("恭喜你，购买成功");
                    }
                }
                //购买攻击类装备
                if (choose2 == 2) {
                    System.out.println("请选择购买的装备：1. 长剑 2. 暴风大剑");
                    int choose3 = sc.nextInt();
                    if (choose3 == 1) {
                        yasuo.equip("长剑");
                        System.out.println("恭喜你，购买成功");
                    }
                    if (choose3 == 2) {
                        yasuo.equip("暴风大剑");
                        System.out.println("恭喜你，购买成功");
                    }
                }
                //购买护甲类装备
                if (choose2 == 3) {
                    System.out.println("请选择购买的装备：1. 布甲 2. 锁子甲");
                    int choose3 = sc.nextInt();
                    if (choose3 == 1) {
                        yasuo.equip("布甲");
                        System.out.println("恭喜你，购买成功");
                    }
                    if (choose3 == 2) {
                        yasuo.equip("锁子甲");
                        System.out.println("恭喜你，购买成功");
                    }
                }
                //购买血量类装备
                if (choose2 == 4) {
                    System.out.println("请选择购买的装备：1. 巨人腰带 2. 狂徒铠甲");
                    int choose3 = sc.nextInt();
                    if (choose3 == 1) {
                        yasuo.equip("巨人腰带");
                        System.out.println("恭喜你，购买成功");
                    }
                    if (choose3 == 2) {
                        yasuo.equip("狂徒铠甲");
                        System.out.println("恭喜你，购买成功");
                    }
                }

            }
            if (choose1 == 2) {
                System.out.println("请选择：1. 大龙 2. 小龙 3. 红Buff 4. 蓝Buff");
                int choose2 = sc.nextInt();
                if (choose2 == 1) {
                    yasuo.levelUp(3);
                }
                if (choose2 == 2) {
                    yasuo.levelUp(2);
                }
                if (choose2 == 3) {
                    yasuo.levelUp(1);
                }
                if (choose2 == 4) {
                    yasuo.levelUp(1);
                }
            }
            if (choose1 == 4) {
                yasuo.showHero();
            }
            if (choose1 == 5) {
                System.out.println("游戏结束！");
                break;
            }
        }
    }
}
