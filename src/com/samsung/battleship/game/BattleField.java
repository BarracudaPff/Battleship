package com.samsung.battleship.game;

import com.samsung.battleship.models.Ship;
import com.samsung.battleship.models.Shot;
import com.samsung.battleship.models.User;

import java.util.ArrayList;

public class BattleField {
    ArrayList<Shot> shots;
    ArrayList<Ship> ships;

    public BattleField() {
        shots = new ArrayList<>();
        ships = new ArrayList<>();
    }

    void placeShip(int x, int y, int length, User user) {
        Ship ship = new Ship(x, y, length, user);
        ships.add(ship);
    }

    void makeShot(int x, int y, User user) {
        Shot shot = new Shot(x, y, user);
        //Checking if shot is not correct
        for (Shot shot1 : shots) {
            if (shot1.x == shot.x && shot1.y == shot.y) {
                System.out.println("Wrong coords");
                return;
            }
        }
        //TODO check if we hit ship
        shots.add(shot);
    }

    boolean isGameOver() {
        ArrayList<Ship> shipsForUser1 = new ArrayList<>();
        ArrayList<Ship> shipsForUser2 = new ArrayList<>();

        for (Ship myShip : ships) {
            if (myShip.user.login.equals(ships.get(0).user.login)) {
                shipsForUser1.add(myShip);
            } else {
                shipsForUser2.add(myShip);
            }
        }

        boolean finished1 = true;
        for (Ship ship : shipsForUser1) {
            if (!ship.isDestroyed()) {
                finished1 = false;
                break;
            }
        }

        boolean finished2 = true;
        for (Ship ship : shipsForUser2) {
            if (!ship.isDestroyed()) {
                finished2 = false;
                break;
            }
        }

        return finished1 || finished2;
    }
}
