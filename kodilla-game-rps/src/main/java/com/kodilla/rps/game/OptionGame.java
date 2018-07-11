package com.kodilla.rps.game;

import java.util.Scanner;

public class OptionGame {
    private final char YES = 'y';
    private final char NO = 'n';

    public boolean endGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure want to end the game? \n YES = y \n NO = n");
        Character theEnd = scanner.next().charAt(0);
        return theEnd == YES;
    }

    public boolean resetGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure want to reset Game, and play once again? \n YES = y \n NO = n");
        Character reset = scanner.next().charAt(0);
        return reset == YES;
    }

    public boolean playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want play again? \n Yes = y \n NO = n");
        Character again = scanner.next().charAt(0);
        return again == YES;
    }
}
