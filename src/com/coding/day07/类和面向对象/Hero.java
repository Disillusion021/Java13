package com.coding.day07.类和面向对象;

public class Hero {
    //定义英雄模板默认属性
    String name = "yasuo";
    double blood = 500;
    double movement = 1.2;
    double attack = 70;
    double armor = 40;
    int lev = 1;

    //定义英雄模板行为
    //等级升级,属性提升
    public void levelUp(int level) {
        lev += level;
        blood += level * 100;
        movement += level * 0.1;
        attack += level * 10;
        armor += level * 4;
    }

    //装备，属性提高
    public void equip(String equipment) {
        if (equipment.equals("速度之靴")) {
            movement += 0.5;
        }
        if (equipment.equals("疾行之靴")) {
            movement += 0.8;
        }
        if (equipment.equals("长剑")) {
            attack += 10;
        }
        if (equipment.equals("暴风大剑")) {
            attack += 45;
        }
        if (equipment.equals("布甲")) {
            armor += 15;
        }
        if (equipment.equals("锁子甲")) {
            armor += 40;
        }
        if (equipment.equals("巨人腰带")) {
            blood += 400;
        }
        if (equipment.equals("狂徒铠甲")) {
            blood += 1000;
        }
    }

    //显示英雄属性信息
    public void showHero() {
        System.out.println("血量为：" + blood + "，移速为：" + movement + "，攻击力为：" + attack + "，护甲为：" + armor);
    }


}
