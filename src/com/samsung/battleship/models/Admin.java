package com.samsung.battleship.models;

public class Admin extends User {
    public Admin(String name, String login, String password) {
        super(name, login, password);
//        super - User
//        this - Admin
    }

    void createGame() {
        //TODO
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
