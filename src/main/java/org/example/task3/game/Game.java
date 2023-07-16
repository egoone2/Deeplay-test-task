package org.example.task3.game;

public class Game {

    private Player player1;
    private Player player2;
    private int[] sequence;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(int sequenceLength) {
        generateSequence(sequenceLength);
        countPoints(player1);
        countPoints(player2);
    }

    private void generateSequence(int sequenceLength) {
        sequence = new int[sequenceLength];

        for (int i = 0; i < sequenceLength; i++) {
            sequence[i] = Dice.diceRoll();
        }
    }

    private void countPoints(Player player) {
        int counter = 0;
        int[] playerSequence = player.getSequence();

        for (int j : sequence) {
            if (j == playerSequence[counter])
                counter++;
            else {
                counter = 0;
                if (j == playerSequence[counter])
                    counter++;
            }



            if (counter == 3) {
                player.setPoints(player.getPoints() + 1);
                counter = 0;
            }
        }
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public int[] getSequence() {
        return sequence;
    }

    public void setSequence(int[] sequence) {
        this.sequence = sequence;
    }
}
