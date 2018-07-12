package com.kodilla.rps.game;

import java.util.Scanner;

public class ChoiceSupport implements MakeAChoice{


    @Override
    public Choice makeAChoice() {
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case '1':
                return Choice.ROCK;
            case '2':
                return Choice.PAPER;
            case '3':
                return Choice.SCISSOR;
            case 'y':
                return Choice.YES;
            case 'n':
                return Choice.NO;
            case 's':
                return Choice.START;
            case 'e':
                return Choice.END;
            case 'r':
                return Choice.RESET;
            default:
                return Choice.INVALID;
        }
    }
}
