package com.samsung.battleship;

import com.samsung.battleship.models.Admin;
import com.samsung.battleship.models.Gamer;

public class Main {

    public static void main(String[] args) {
        Admin admin = new Admin("Player", "Player", "123123");
        Gamer gamer = new Gamer("Ivan", "Ivan123", "123123");
        System.out.println(admin);
        System.out.println(gamer);
    }
}
