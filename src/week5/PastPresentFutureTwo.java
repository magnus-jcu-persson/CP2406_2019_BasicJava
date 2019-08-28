package week5;

import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFutureTwo {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Complete the following:");
        System.out.println("Month >>>");
        int userMonth = userInput.nextInt();

        System.out.println("Day >>>");
        int userDay = userInput.nextInt();

        System.out.println("Year >>>");
        int userYear = userInput.nextInt();

        LocalDate now = LocalDate.now();
        LocalDate userDate = LocalDate.of(userYear, userMonth, userDay);

        String output = "The chosen month is";
        if (userDate.isBefore(now))
            output += " before";
        else if (userDate.isAfter(now))
            output += " after";
        output += " this month";

        System.out.println(output);
    }
}
