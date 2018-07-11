package com.kodilla.rps.game;

import java.util.Random;

public class Computer implements MakeAChoice{

    Choice[] choices = {Choice.ROCK, Choice.PAPER, Choice.SCISSOR};

    @Override
    public Choice makeAChoice() {
        Choice[] computerChoices = choices;
        Random random = new Random();
        int choiceRandom = random.nextInt(computerChoices.length);
        return computerChoices[choiceRandom];
    }

}
