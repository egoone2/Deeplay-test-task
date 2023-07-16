package org.example.task3;

import org.example.task3.game.Game;
import org.example.task3.game.Player;
import org.example.task3.math.PossibilityCalculator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 5};
        int[] second = new int[]{1, 2, 3};

        Player player1 = new Player(first);
        Player player2 = new Player(second);

        Game game = new Game(player1, player2);
        game.play(1000);

        int[] sequence = game.getSequence();
        System.out.println("sequence = " + Arrays.toString(sequence));
        System.out.println("Player 1 points: " + player1.getPoints());
        System.out.println("Player 2 points: " + player2.getPoints() + "\n");

        PossibilityCalculator calculator = new PossibilityCalculator(player1, player2, game);
        calculator.calculate(100000, 1000);

    }

}
