package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    Player player;
    Computer computer;
    Driver driver;
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
        Character theEnd = scanner.next().charAt(0);
        new Game();
        return theEnd == 'y';
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


    public void startGame() {
        Choice playerChoice = player.playerChoice();
        driver.display(player.getName(), playerChoice);

        Choice computerChoice = computer.computerChoice();
        driver.display("computer", computerChoice);

        int compareChoice = driver.compere(playerChoice, computerChoice);
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
            System.out.println("The " + player.getName() + " WON!!!");
            new Game();
        }
        if (computerScore == player.getNumberOfRounds()) {
            System.out.println("Computer WON, try again...");
            new Game();
        }
        // Ask the player to play again
        if(playAgain()) {
            System.out.println();
            startGame();
        } else {
            printStats();
        }
    }

    public void getName() {
        player.askName();
    }

    public void getNumbers() {
        player.getNumberOfRounds();
    }

    public void printStats() {
        System.out.println("Player score: " + playerScore);
        System.out.println("Computer score: " + computerScore);
        System.out.println("Number of rounds: " + numberOfGames);
    }

}
