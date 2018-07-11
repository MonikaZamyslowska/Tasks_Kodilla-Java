package com.kodilla.rps.game;

import java.util.Scanner;

public class Player implements MakeAChoice {

    private String name;
    Scanner scanner = new Scanner(System.in);

    public Player() {
        System.out.println("Please enter your name.");
        name = scanner.next();
    }

    @Override
    public Choice makeAChoice() {
        int playerChoice;
        System.out.println("Select: \nROCK = 1 \nPAPER = 2 \nSCISSOR = 3");
        playerChoice = scanner.nextInt();

        switch (playerChoice) {
            case 1:
                return Choice.ROCK;
            case 2:
                return Choice.PAPER;
            case 3:
                return Choice.SCISSOR;
            default:
                return Choice.INVALID;
        }
    }
}
