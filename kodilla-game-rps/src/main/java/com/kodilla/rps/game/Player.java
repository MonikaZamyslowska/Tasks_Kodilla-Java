package com.kodilla.rps.game;

import java.util.Scanner;

public class Player {
    private String name;
    Scanner scanner = new Scanner(System.in);

    public Player() {
        System.out.println("Please enter your name.");
        name = scanner.next();

    }

    public String getName() {
        return name;
    }
}
