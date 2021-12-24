package com.coding.day09.继承进阶;

public class NetGame extends Game {
    private String server;

    public NetGame(String name, String type, int player, String server) {
        super(name, type, player);
        this.server = server;
    }

    public boolean login(String server, String password) {
        if (server.equals(this.server) && password.equals("123456")) {
            return true;
        } else {
            return false;
        }
    }
}
