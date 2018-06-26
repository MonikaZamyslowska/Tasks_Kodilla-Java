package com.kodilla.rps;

import java.awt.*;
import java.util.Scanner;

public class Player {
    private String name;
    private int numberOfRounds;
    Scanner scanner = new Scanner(System.in);

    public void askName() {
        //request for the player`s name
        System.out.println("Please enter your name...");
        name = scanner.next();
    }

    public void askNumberOfRounds() {
        //request for the number of rounds
        System.out.println("Hello " + name + "/n How many rounds would you like to play?");
        numberOfRounds = scanner.nextInt();

    }

    public Game.Choice playerChoice() {
        Character playerChoice;
        System.out.println("Select: /n ROCK = 1 /n PAPER = 2 /n SCISSOR = 3 /n END GAME = y /n RESET GAME = x");
        playerChoice = scanner.next().charAt(0);
        switch (playerChoice) {
            case '1': return Game.Choice.ROCK;
            case '2': return Game.Choice.PAPER;
            case '3': return Game.Choice.SCISSOR;
            case 'x': return Game.Choice.END;
            case 'y': return Game.Choice.RESET;
        }
        return playerChoice();
    }

    public boolean endGame() {
        //scanner = new Scanner(System.in);
        System.out.println("Are you sure want to end the game? /n YES = y /n NO = n");
        Character end = scanner.next().charAt(0);
        return end == 'y';
    }

    public boolean resetGame() {
        System.out.println("Are you sure want to reset Game, and play once again? /n YES = y /n NO = /n");
        Character reset = scanner.next().charAt(0);
        return reset == 'y';
    }

    public boolean playAgain() {
        System.out.println("Do you want play again? /n Yes = y /n NO = /n");
        Character again = scanner.next().charAt(0);
        return again == 'y';
    }

    public String getName() {
        return name;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }
}
