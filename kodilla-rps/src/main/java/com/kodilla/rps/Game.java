package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private final String SELECT = " selected ";
    private final char YES = 'y';
    private final char NO = 'n';
    private final String WIN = "You WIN!!";
    private final String LOUSE = "You LOUSE!!";
    private final String TIE = "TIE!!";
    private final String CHOICE = "Select: \nROCK = 1 \nPAPER = 2 \nSCISSOR = 3";
    private final String END = "Are you sure want to end the game? \n YES = y \n NO = n";
    private final String RESET = "Are you sure want to reset Game, and play once again? \n YES = y \n NO = n";
    private final String PLAY_AGAIN = "Do you want play again? \n Yes = y \n NO = n";
    private final String COMPUTER_SCORE = "COMPUTER SCORE: ";
    private final String PLAYER_SCORE = "PLAYER SCORE: ";
    private final String NUMBERS_ROUNDS = "NUMBER OF ROUNDS: ";
    private int computerScore = 0;
    private int playerScore = 0;
    private int numberOfGames = 0;
    private boolean end = false;
    private Scanner scanner = new Scanner(System.in);

    public void resetGamePoints() {
        playerScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    public  void displayChoice(String name, Choice what) {
        if (what != Choice.INVALID) {
            System.out.println(name.toUpperCase() + SELECT + what);
        }
    }

    public  int compareChoice(Choice choicePlayer, Choice choiceComputer) {
        if (choicePlayer.equals(choiceComputer)) {
            System.out.println(TIE);
        } else {
            switch (choicePlayer) {
                case ROCK:
                    System.out.println(LOUSE);
                    computerScore++;
                    return (choiceComputer == Choice.SCISSOR ? 1 : -1);
                case PAPER:
                    System.out.println(WIN);
                    playerScore++;
                    return (choiceComputer == Choice.ROCK ? 1 : -1);
                case SCISSOR:
                    System.out.println(WIN);
                    playerScore++;
                    return (choiceComputer == Choice.PAPER ? 1 : -1);
                case INVALID:
                    break;
            }
        }
        return 0;
    }

    public Choice rpsChoice() {
        System.out.println();
        char playerChoice = scanner.next().charAt(0);

        switch (playerChoice) {
            case '1':
                return Choice.ROCK;
            case '2':
                return Choice.PAPER;
            case '3':
                return Choice.SCISSOR;
            default:
                return Choice.INVALID;
        }
    }

    public Choice processChoice() {
        System.out.println(CHOICE);
        char choiceWhat = scanner.next().charAt(0);
        switch (choiceWhat) {
            case 's':
                startGame();
                return Choice.START;
            case 'e':
                endGame();
                return Choice.END;
            case 'r':
                resetGame();
                return Choice.RESET;
            default:
                return Choice.INVALID;
        }
    }

    public boolean endGame() {
        System.out.println(END);
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
        System.out.println(RESET);
        char reset = scanner.next().charAt(0);
        if (reset != YES && reset != NO || reset == NO) {
            playAgain();
        }
        resetGamePoints();
        end = false;
        startGame();
        return reset == YES;
    }

    public boolean playAgain() {
        System.out.println(PLAY_AGAIN);
        char again = scanner.next().charAt(0);
        if (again == YES) {
            end = false;
            startGame();
        } else {
            processChoice();
        }
        return again == YES;
    }

    public void startGame() {
        Player player = new Player();
        Computer computer = new Computer();
        while(!end ) {
            Choice playerChoice = rpsChoice() ;
            if (playerChoice != Choice.INVALID) {
                displayChoice(player.getName(), playerChoice);
                Choice computerChoice = computer.computerChoice();
                displayChoice(computer.getComputerName(), computerChoice);
                compareChoice(playerChoice, computerChoice);
                numberOfGames++;
                if (numberOfGames > player.getNumberOfRounds() - 1) {
                    printStats();
                    end = true;
                }
            }
        }
        playAgain();
    }

    public void printStats() {
        System.out.println(PLAYER_SCORE + playerScore);
        System.out.println(COMPUTER_SCORE + computerScore);
        System.out.println(NUMBERS_ROUNDS + numberOfGames);
        if (playerScore > computerScore) {
            System.out.println(WIN);
        }
        if (computerScore > playerScore) {
            System.out.println(LOUSE);
        }
        if (playerScore == computerScore) {
            System.out.println(TIE);
        }
    }
}
