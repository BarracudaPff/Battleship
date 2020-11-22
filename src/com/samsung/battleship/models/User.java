package com.samsung.battleship.models;


// public
// protected
// default
// private
abstract public class User {
    public String name;
    public String login;
    public String password;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public boolean enter(String login, String password) {
        //TODO релизовать метод
        return false;
    }
}
