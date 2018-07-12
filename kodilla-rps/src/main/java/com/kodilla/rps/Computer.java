package com.kodilla.rps;

import java.util.Random;

public class Computer {
    private String computerName;

    public Computer() {
        computerName = "Computer";
    }

    public Choice computerChoice() {
        Choice[] choices = {Choice.ROCK, Choice.PAPER, Choice.SCISSOR};
        Random random = new Random();
        int index = random.nextInt(choices.length);
        return choices[index];
    }

    public String getComputerName() {
        return computerName;
    }
}
