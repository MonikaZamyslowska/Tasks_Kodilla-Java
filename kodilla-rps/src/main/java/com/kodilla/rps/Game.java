package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private int computerScore;
    private int playerScore;
    private int numberOfGames;
    private boolean end;

    public enum Choice {
        ROCK, PAPER, SCISSOR, END, RESET
    }


    public Game() {
        playerScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    public boolean endGame() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you sure want to end the game? \n YES = y \n NO = n");
            Character theEnd = scanner.next().charAt(0);
            end = false;
            if (theEnd == 'y') {
                end = true;
                new Game();
            }
            if (theEnd == 'n') {
                startGame();
            }
        return end;
    }

    public boolean resetGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure want to reset Game, and play once again? \n YES = y \n NO = n");
        Character reset = scanner.next().charAt(0);
        playerScore = 0;
        computerScore = 0;
        numberOfGames = 0;
        System.out.println("Setting are reset...");
        startGame();
        return reset == 'y';
    }

    public boolean playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want play again? \n Yes = y \n NO = n");
        Character again = scanner.next().charAt(0);
        playerScore = 0;
        computerScore = 0;
        numberOfGames = 0;
        return again == 'y';
    }

    public  void display(String name, Choice what) {
        switch (what) {
            case ROCK:
                System.out.println(name + " selected ROCK ");
                break;
            case PAPER:
                System.out.println(name + " selected Paper ");
                break;
            case SCISSOR:
                System.out.println(name + " selected Scissor");
                break;
            case RESET:
                resetGame();
                break;
            case END:
                endGame();
            default:
                System.out.println("Error! Please once again");
                startGame();
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
            display(player.getName(), playerChoice);

            Choice computerChoice = computer.computerChoice();
            display("computer", computerChoice);

            int compareChoice = compere(playerChoice, computerChoice);
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
            if (numberOfGames < player.getNumberOfRounds() - 1) {
                numberOfGames++;
            } else {
                printStats();
                if(playAgain()) {
                    System.out.println();
                    new Game();
                    startGame();
                }
            }
        }
    }


    public void printStats() {
        System.out.println("Player score: " + playerScore);
        System.out.println("Computer score: " + computerScore);
        System.out.println("Number of rounds: " + numberOfGames);
        if (playerScore > computerScore) {
            System.out.println("You WIN!");
        }
        if (computerScore > playerScore) {
            System.out.println("Computer WON!");
        }
        if (playerScore == computerScore) {
            System.out.println("TIE!");
        }
    }

}
