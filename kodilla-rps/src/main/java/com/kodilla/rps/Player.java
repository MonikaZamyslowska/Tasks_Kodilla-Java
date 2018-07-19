package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    private String name;
    private int numberOfRounds;
    Scanner scanner = new Scanner(System.in);
    String ASK_NUMBER = "Hello, how many rounds would you like to play?";

    public Player() {
        name = askName();
        numberOfRounds = askNumberOfRounds();
    }

    public String askName() {
        System.out.println("Please enter your name...");
        name = scanner.next();
        return name;
    }

    public int askNumberOfRounds() {
        int number = PlayerDialogs.getIntInput(ASK_NUMBER);
        return number;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }
}
