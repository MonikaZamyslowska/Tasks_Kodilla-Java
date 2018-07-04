package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private static String SELECT = " selected ";
    private static char YES = 'y';
    private static char NO = 'n';
    private int computerScore = 0;
    private int playerScore = 0;
    private int numberOfGames = 0;
    private boolean end = false;

    public enum Choice {
        INVALID, START, ROCK, PAPER, SCISSOR, END, RESET
    }

    public boolean endGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure want to end the game? \n YES = y \n NO = n");
        Character theEnd = scanner.next().charAt(0);
        if (theEnd == YES) {
            end = true;
        }
        if (theEnd == NO) {
            playAgain();
        }
        return end;
    }

    public boolean resetGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure want to reset Game, and play once again? \n YES = y \n NO = n");
        Character reset = scanner.next().charAt(0);
        if (reset != YES && reset != NO) {
            playAgain();
        }
        playerScore = 0;
        computerScore = 0;
        numberOfGames = 0;
        System.out.println("Setting are reset...\n");
        return reset == YES;
    }

    public boolean playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want play again? \n Yes = y \n NO = n");
        Character again = scanner.next().charAt(0);
        if (again == NO) {
            endGame();
        }
        if (again == YES) {
            playerScore = 0;
            computerScore = 0;
            numberOfGames = 0;
            new Game();
            startGame();
        }
        return again == YES;
    }

    public  void display(String name, Choice what) {
        if (what != Choice.INVALID) {
            switch (what) {
                case ROCK:
                    System.out.println(name.toUpperCase() + SELECT + what);
                    break;
                case PAPER:
                    System.out.println(name.toUpperCase() + SELECT + what);
                    break;
                case SCISSOR:
                    System.out.println(name.toUpperCase() + SELECT + what);
            }
        }
    }

    public void process(Choice what) {

        switch (what) {
            case START:
                break;
            case END:
                endGame();
                break;
            case RESET:
                resetGame();
        }
    }

    public  int compere(Choice choicePlayer, Choice choiceComputer) {
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
        Player player = new Player();
        Computer computer = new Computer();
        while(!end ) {
            Choice playerChoice = player.playerChoice();
            if (playerChoice != Choice.INVALID) {
                display(player.getName(), playerChoice);
                Choice computerChoice = computer.computerChoice();
                display("COMPUTER", computerChoice);
                int compareChoice = compere(playerChoice, computerChoice);
                switch (compareChoice) {
                    case -1: // computer wins
                        System.out.println("Sorry you louse :( \n");
                        computerScore++;
                        break;
                    case 0:
                        System.out.println("Tie! \n");
                        break;
                    case 1:
                        System.out.println("You win!!! :)\n");
                        playerScore++;
                        break;
                    }
                if (numberOfGames < player.getNumberOfRounds() - 1) {
                    numberOfGames++;
                    Choice playerProcessChoice = player.playerProcessChoice();
                    if (playerProcessChoice != Choice.INVALID) {
                        process(playerProcessChoice);
                    } else {
                        player.playerProcessChoice();
                    }
                } else {
                    printStats();
                    if (playAgain()) {
                        System.out.println();
                        new Game();
                    } else {
                        playAgain();
                    }
                }
            }
        }
    }


    public void printStats() {
        System.out.println("Player score: " + playerScore);
        System.out.println("Computer score: " + computerScore);
        System.out.println("Number of rounds: " + numberOfGames);
        if (playerScore > computerScore) {
            System.out.println("You WIN!\n");
        }
        if (computerScore > playerScore) {
            System.out.println("Computer WON!\n");
        }
        if (playerScore == computerScore) {
            System.out.println("TIE! \n");
        }
    }

}
