package com.kodilla.rps;

import java.util.Random;

public class Computer {

        Player player;

    public Game.Choice computerChoice() {
        Game.Choice[] choices = Game.Choice.values();
        Random random = new Random();
        int index = random.nextInt(choices.length -2);
        return choices[index];

    }
}
