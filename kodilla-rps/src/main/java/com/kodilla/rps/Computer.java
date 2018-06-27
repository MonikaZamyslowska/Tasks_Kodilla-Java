package com.kodilla.rps;

import java.util.Random;

public class Computer {

    public Game.Choice computerChoice() {
        Game.Choice[] choices = Game.Choice.values();
        Random random = new Random();
        int index = random.nextInt(choices.length -2); // -2 because the player has two additional options
        return choices[index];
    }
}
