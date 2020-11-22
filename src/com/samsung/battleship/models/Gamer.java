package com.samsung.battleship.models;

public class Gamer extends User {
    public Gamer(String name, String login, String password) {
        super(name, login, password);
    }

    void joinGame() {
        //TODO
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
