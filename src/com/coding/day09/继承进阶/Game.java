package com.coding.day09.继承进阶;

import java.util.Random;

public class Game {
    private String name;
    private String type;
    private int player;

    public Game() {
        name = "新游戏";
        type = "休闲类";
        player = 0;
    }

    public Game(String name, String type, int player) {
        this.name = name;
        this.type = type;
        this.player = player;
    }

    public void loadMap() {
        switch (type) {
            case "角色扮演":
                System.out.println(name + "游戏，属于" + type + "类型，请等待，正在加载任务地图");
                break;
            case "动作类":
                System.out.println(name + "游戏，属于" + type + "类型，请等待，正在加载作战地图");
                break;
            case "棋牌类":
                System.out.println(name + "游戏，属于" + type + "类型，请等待，正在加载棋牌地图");
                break;
            default:
                System.out.println(name + "游戏，属于" + "其他" + "类型，请等待，正在加载其他地图");
        }
    }

    public int game() {
        int deadPeople = (int) (Math.random() * (player + 1));
        player -= deadPeople;
        return player;
    }
}
