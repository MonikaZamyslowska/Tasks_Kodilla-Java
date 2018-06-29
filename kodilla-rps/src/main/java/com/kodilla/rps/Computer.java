package com.kodilla.rps;

import java.util.Random;

public class Computer {

    Game.Choice[] gameChoice = {Game.Choice.ROCK, Game.Choice.PAPER, Game.Choice.SCISSOR};

    public Game.Choice computerChoice() {
        Game.Choice[] choices = gameChoice;
        Random random = new Random();
        int index = random.nextInt(choices.length);
        return choices[index];
    }
}
