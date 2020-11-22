package com.samsung.battleship.models;

public class Ship {
    // left/right corner
    public int x;
    public int y;
    public int length;
    public User user;
    public int health = length;

    public Ship(int x, int y, int length, User user) {
        this.x = x;
        this.y = y;
        this.length = length;
    }

    public boolean makeDamage() {
        if (isDestroyed()) {
            return true;
        }
        health--;
        return false;
    }

    public boolean isDestroyed() {
        return health == 0;
    }
}
