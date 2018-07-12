package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private final String SELECT = " selected ";
    private final char YES = 'y';
    private final char NO = 'n';
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
        if (theEnd == NO) {
            playAgain();
        }
        if (theEnd == YES) {
            end = true;
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
        if (again == YES) {
            playerScore = 0;
            computerScore = 0;
            numberOfGames = 0;
            end = false;
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


    public  int compere(Choice choicePlayer, Choice choiceComputer) {
        if (choicePlayer.equals(choiceComputer)) {
            System.out.println("Tie! \n");
            return 0;
        }
        switch (choicePlayer) {
            case ROCK:
                System.out.println("Sorry you louse :( \n");
                computerScore++;
                return (choiceComputer == Choice.SCISSOR ? 1 : -1);
            case PAPER:
                System.out.println("You win!!! :)\n");
                playerScore++;
                return (choiceComputer == Choice.ROCK ? 1 : -1);
            case SCISSOR:
                System.out.println("You win!!! :)\n");
                playerScore++;
                return (choiceComputer == Choice.PAPER ? 1 : -1);
            case INVALID:
                break;
        }
        return 0;
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

    public void startGame() {
        Player player = new Player();
        Computer computer = new Computer();
        while(!end ) {
            Choice playerChoice = player.playerChoice();
            if (playerChoice != Choice.INVALID) {
                display(player.getName(), playerChoice);
                Choice computerChoice = computer.computerChoice();
                display("COMPUTER", computerChoice);
                compere(playerChoice, computerChoice);
                }
            if (numberOfGames < player.getNumberOfRounds() - 1) {
                numberOfGames++;
            } else {
                end = true;
            }
        }
        if (!playAgain()) {
            printStats();
            process(player.playerProcessChoice());
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
