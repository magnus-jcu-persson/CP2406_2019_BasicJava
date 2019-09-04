package week6;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter three first names");
        String[] babyNames = new String[3];
        for (int x = 0; x < 3; x++) {
            System.out.println("Name >>>");
            String userChoice = userInput.nextLine();
            babyNames[x] = userChoice;
        }

        int length = babyNames.length;
        for ( int i = 0; i < length; i++ ) {

            String firstName = babyNames[i];
            for ( String babyName: babyNames ) {
                if (!babyName.equals(firstName)) {
                    System.out.println(firstName + "-" + babyName);
                }
            }
        }
    }
}
