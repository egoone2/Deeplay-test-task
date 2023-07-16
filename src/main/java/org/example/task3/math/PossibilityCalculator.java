package org.example.task3.math;

import org.example.task3.game.Game;
import org.example.task3.game.Player;

import java.util.Arrays;

public class PossibilityCalculator {

    private Player p1;
    private Player p2;
    private Game game;

    private int p1WinCounter = 0;
    private int p2WinCounter = 0;
    private int drawCounter = 0;

    public PossibilityCalculator(Player p1, Player p2, Game game) {
        this.p1 = p1;
        this.p2 = p2;
        this.game = game;
    }

    public void calculate(int iterations, int randomSequenceLength) {

        if (Arrays.equals(p1.getSequence(), p2.getSequence())) {
            System.out.println("Вероятность ничьей 100 процентов");
            return;
        }

        resetPoints();
        for (int i = 0; i < iterations; i++) {
            game.play(randomSequenceLength);
            countPoints();
            resetPoints();
        }

        double p1WinPossibility = (double) p1WinCounter / iterations;
        double p2WinPossibility = (double) p2WinCounter / iterations;
        double drawPossibility = (double) drawCounter / iterations;

        System.out.println("Вероятность победы первого игрока: " + p1WinPossibility);
        System.out.println("Вероятность победы второго игрока: " + p2WinPossibility);
        System.out.println("Вероятность ничьей: " + drawPossibility);
    }

    private void resetPoints() {
        p1.setPoints(0);
        p2.setPoints(0);
    }

    private void countPoints() {
        if (p1.getPoints() > p2.getPoints())
            p1WinCounter++;
        else {
            if (p1.getPoints() < p2.getPoints())
                p2WinCounter++;
            else
                drawCounter++;
        }
    }
}
