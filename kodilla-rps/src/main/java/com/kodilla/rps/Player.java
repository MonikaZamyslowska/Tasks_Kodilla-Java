package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    private String name;
    private int numberOfRounds;
    Scanner scanner = new Scanner(System.in);

    public Player() {
        name = askName();
        numberOfRounds = askNumberOfRounds();
    }

    public String askName() {
        System.out.println("Please enter your name...");
        String name = scanner.next();
        return name;
    }

    public int askNumberOfRounds() {
        System.out.println("Hello " + getName().toUpperCase() + " :), How many rounds would you like to play?");
        int number = scanner.nextInt();
        return number;
    }

    public Game.Choice playerChoice() {
        char playerChoice;
        System.out.println("Select: \nROCK = 1 \nPAPER = 2 \nSCISSOR = 3");
        playerChoice = scanner.next().charAt(0);

        switch (playerChoice) {
            case '1':
                return Game.Choice.ROCK;
            case '2':
                return Game.Choice.PAPER;
            case '3':
                return Game.Choice.SCISSOR;
            default:
                return Game.Choice.INVALID;
        }
    }

    public Game.Choice playerProcessChoice() {
        char playerChoice;
        System.out.println("START = 'a' \nEND GAME = 'x' \nRESET GAME = 'n'");
        playerChoice = scanner.next().charAt(0);

        switch (playerChoice) {
            case 's':
                return Game.Choice.START;
            case 'e':
                return Game.Choice.END;
            case 'r':
                return Game.Choice.RESET;
            default:
                return Game.Choice.INVALID;
        }
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
