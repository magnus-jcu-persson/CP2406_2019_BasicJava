package week5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userGuess = userInput.nextInt();

        if (userGuess % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
