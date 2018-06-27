package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    private Game game;
    private String name;
    private int numberOfRounds;
    Scanner scanner = new Scanner(System.in);

    public Player() {
        name = game.askName();
        numberOfRounds = game.askNumberOfRounds();
    }

//    public void askName() {
//        //request for the player`s name
//        System.out.println("Please enter your name...");
//        name = scanner.next();
//    }
//
//    public void askNumberOfRounds() {
//        //request for the number of rounds
//        System.out.println("Hello " + name + "/n How many rounds would you like to play?");
//        numberOfRounds = scanner.nextInt();
//
//    }

    public Game.Choice playerChoice() {
        char playerChoice;
        System.out.println("Select: /n ROCK = 1 /n PAPER = 2 /n SCISSOR = 3 /n END GAME = x /n RESET GAME = n");
        playerChoice = scanner.next().charAt(0);
        if (playerChoice == '1' || playerChoice == '2' || playerChoice == '3' || playerChoice == '3' ||
                playerChoice == 'x' || playerChoice == 'n') {
            switch (playerChoice) {
                case '1':
                    return Game.Choice.ROCK;
                case '2':
                    return Game.Choice.PAPER;
                case '3':
                    return Game.Choice.SCISSOR;
                case 'x':
                    return Game.Choice.END;
                case 'n':
                    return Game.Choice.RESET;
            }
        }
        return playerChoice();
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
