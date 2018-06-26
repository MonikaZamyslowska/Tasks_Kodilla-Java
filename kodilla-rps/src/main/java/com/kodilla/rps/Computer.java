package com.kodilla.rps;

import java.util.Random;

public class Computer {

    public Game.Choice computerChoice() {
        Random random = new Random();
        int computerChoice = random.nextInt(3 );
        switch (computerChoice) {
            case 0: return Game.Choice.ROCK;
            case 1: return Game.Choice.PAPER;
            case 2: return Game.Choice.SCISSOR;
        }
        return computerChoice();
    }
}
