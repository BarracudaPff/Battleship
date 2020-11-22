package com.samsung.battleship.models;

public class Shot {
    public int x;
    public int y;
    public User user;

    public Shot(int x, int y, User user) {
        this.x = x;
        this.y = y;
        this.user = user;
    }
}
