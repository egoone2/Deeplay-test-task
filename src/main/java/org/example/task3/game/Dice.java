package org.example.task3.game;

import java.util.Random;

public class Dice {

    public static int diceRoll() {
        return new Random().nextInt(6) + 1;
    }

}
