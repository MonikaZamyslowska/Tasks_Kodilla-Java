package com.kodilla.rps;

import java.util.Scanner;

public class PlayerDialogs {

    public static int getIntInput(String communique) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(communique);
            String answer = scanner.nextLine();
            try {
                int result = Integer.parseInt(answer);
                return result;
            } catch (Exception e) {
                System.out.println("Wrong input. Try again.");
            }
        }
    }
}
