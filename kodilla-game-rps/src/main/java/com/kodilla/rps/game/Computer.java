package com.kodilla.rps.game;

import java.util.Random;

public class Computer implements MakeAChoice{
    private String name;

    public Computer() {
        name = "Computer";
    }

    @Override
    public Choice makeAChoice() {
        Choice[] computerChoices = {Choice.ROCK, Choice.PAPER, Choice.SCISSOR};
        Random random = new Random();
        int choiceRandom = random.nextInt(computerChoices.length);
        return computerChoices[choiceRandom];
    }

    public String getName() {
        return name;
    }
}
