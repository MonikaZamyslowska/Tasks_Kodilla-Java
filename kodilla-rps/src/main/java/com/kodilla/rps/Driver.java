package com.kodilla.rps;

public class Driver {

    Game game;

    public void display(String name, Game.Choice what) {
        switch (what) {
            case ROCK:
                System.out.println(name + " selected ROCK ");
                break;
            case PAPER:
                System.out.println(name + " selected Paper ");
                break;
            case SCISSOR:
                System.out.println(name + " selected Scissor");
                break;
            case RESET:
                game.resetGame();
                break;
            case END:
                game.endGame();
        }
    }

    public int compere(Game.Choice choicePlayer, Game.Choice choiceComputer) {
        if (choicePlayer.equals(choiceComputer)) return 0;
        switch (choicePlayer) {
            case ROCK:
                return (choiceComputer == Game.Choice.SCISSOR ? 1 : -1);
            case PAPER:
                return (choiceComputer == Game.Choice.ROCK ? 1 : -1);
            case SCISSOR:
                return (choiceComputer == Game.Choice.PAPER ? 1 : -1);
        }
        return 0;
    }
}
