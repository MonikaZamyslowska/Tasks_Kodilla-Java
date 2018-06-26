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
        System.out.println("Please enter number turns of the game...");

    }

    public Driver.Choice playerChoice() {
        Character playerChoice;
        System.out.println("Select: /n ROCK = 1 /n PAPER = 2 /n SCISSOR = 3 /n If you want");
        playerChoice = scanner.next().charAt(0);
        switch (playerChoice) {
            case '1': return Driver.Choice.ROCK;
            case '2': return Driver.Choice.PAPER;
            case '3': return Driver.Choice.SCISSOR;
            case 'x': return Driver.Choice.END;
            case 'y': return Driver.Choice.RESET;
        }
        return playerChoice();
    }

    public boolean endGame() {
        //scanner = new Scanner(System.in);
        System.out.println("Are you sure want to end the game? (y/n)");
        Character end = scanner.next().charAt(0);
        return end == 'y';
    }

    public boolean resetGame() {
        return true;
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
