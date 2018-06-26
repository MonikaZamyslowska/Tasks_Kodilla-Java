package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    Player player = new Player();
    Computer computer = new Computer();
    private int computerScore;
    private int playerScore;
    private int numberOfGames;

    public enum Choice {
        ROCK, PAPER, SCISSOR, END, RESET
    }

    public Game() {
        playerScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    public boolean endGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure want to end the game? /n YES = y /n NO = n");
        Character end = scanner.next().charAt(0);
        return end == 'y';
    }

    public boolean resetGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure want to reset Game, and play once again? /n YES = y /n NO = /n");
        Character reset = scanner.next().charAt(0);
        return reset == 'y';
    }

    public boolean playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want play again? /n Yes = y /n NO = /n");
        Character again = scanner.next().charAt(0);
        return again == 'y';
    }

    public void display(String name, Choice playerChoice) {
        name = player.getName();
        switch (playerChoice) {
            case ROCK:
                System.out.println(name + " selected ROCK ");
            case PAPER:
                System.out.println(name + " selected Paper ");
            case SCISSOR:
                System.out.println(name + " selected Scissor");
            case RESET:
                resetGame();
            case END:
                endGame();
            }
        }


    public int compere(Choice choicePlayer, Choice choiceComputer) {
        choicePlayer = player.playerChoice();
        choiceComputer = computer.computerChoice();
        if (choicePlayer.equals(choiceComputer)) return 0;
        switch (choicePlayer) {
            case ROCK:
                return (choiceComputer == Choice.SCISSOR ? 1 : -1);
            case PAPER:
                return (choiceComputer == Choice.ROCK ? 1 : -1);
            case SCISSOR:
                return (choiceComputer == Choice.PAPER ? 1 : -1);
        }
        return 0;
    }



}
