package com.kodilla.rps.game;

public class ProcessChoices {

    public  int compareChoice(Choice choicePlayer, Choice choiceComputer) {
        if (choicePlayer.equals(choiceComputer)) {
            System.out.println("Tie! \n");
            return 0;
        }
        switch (choicePlayer) {
            case ROCK:
                System.out.println("Sorry you louse :( \n");
                Game.playerScore++;
                return (choiceComputer == Choice.SCISSOR ? 1 : -1);
            case PAPER:
                System.out.println("You win!!! :)\n");
                Game.playerScore++;
                return (choiceComputer == Choice.ROCK ? 1 : -1);
            case SCISSOR:
                System.out.println("You win!!! :)\n");
                Game.playerScore++;
                return (choiceComputer == Choice.PAPER ? 1 : -1);
            case INVALID:
                break;
        }
        return 0;
    }
}
