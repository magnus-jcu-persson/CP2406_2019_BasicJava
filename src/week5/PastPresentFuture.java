package week5;

import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
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
        String output = "The chosen year is";
        if (now.getYear() != userYear)
            output += "NOT ";
        output += " this year";

        System.out.println(output);

        output = "The chosen month is";
        if (now.getMonthValue() < userMonth)
            output += " earlier than";
        else if (now.getMonthValue() > userMonth)
            output += " later than";

        output += " this month";


    }
}
