package week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        while (game.wins < 1) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter your guess (1 - 11):");
            int userGuess = userInput.nextInt();

            game.makeGuess(userGuess);

            if (game.wins == 1) {
                System.out.println("You guessed correctly!");
            } else {
                System.out.println("Sorry, you failed miserably.");
            }

            System.out.println("Attempts: " + game.count);
        }
    }
}
