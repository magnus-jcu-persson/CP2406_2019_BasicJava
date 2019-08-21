package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        ArrayList<Integer> numberList = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number:");
            numberList.add(userInput.nextInt());
        }
        Collections.sort(numberList);

        for ( int number : numberList ) {
            System.out.println(number);
        }
    }
}
