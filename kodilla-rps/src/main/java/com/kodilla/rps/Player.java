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

    public String getName() {
        return name;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }
}
