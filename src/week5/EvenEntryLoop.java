package week5;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int userChoice = 0;
        while (userChoice != 999) {
            System.out.println("Enter even number or 999 to exit");
            userChoice = userInput.nextInt();
            if (userChoice % 2 == 0)
                System.out.println("Good Job");
            else if (userChoice != 999)
                System.out.println("WRONG -- ERROR -- WRONG");
        }
     }
}
