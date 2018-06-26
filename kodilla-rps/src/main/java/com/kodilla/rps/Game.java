package com.kodilla.rps;

public class Game {
    Player player;
    Computer computer;
    private int computerScore;
    private int playerScore;
    private int numberOfGames;

    public enum Choice {
        ROCK, PAPER, SCISSOR, END, RESET
    }

    public Game() {
        Player player = new Player();
        Computer computer = new Computer();
        playerScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    public int compere(Player playerChoice, Computer computerChoice) {
        return 0;
    }



}
