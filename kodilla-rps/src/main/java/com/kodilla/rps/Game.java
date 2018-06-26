package com.kodilla.rps;

import java.util.Scanner;

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
        playerScore = 0;
        computerScore = 0;
        numberOfGames = 0;
        return reset == 'y';
    }

    public boolean playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want play again? /n Yes = y /n NO = /n");
        Character again = scanner.next().charAt(0);
        return again == 'y';
    }

    public void display(String name, Choice who) {
        switch (who) {
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

    public void startGame() {
        Choice playerChoice = player.playerChoice();
        display(player.getName(), player.playerChoice());

        Choice computerChoice = computer.computerChoice();
        display("computer", computer.computerChoice());

        int compareChoice = playerChoice.compareTo(computerChoice);
        switch (compareChoice) {
            case -1: // computer wins
                System.out.println("Sorry you louse :( ");
                computerScore++;
                break;
            case 0:
                System.out.println("Tie!");
                break;
            case 1:
                System.out.println("You win!!! :)");
                playerScore++;
                break;
        }
        numberOfGames++;
        if (playerScore == player.getNumberOfRounds()) {
            System.out.println();
            startGame();
        }



        }
    }
