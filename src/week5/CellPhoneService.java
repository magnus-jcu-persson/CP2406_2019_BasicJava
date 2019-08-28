package week5;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Complete the following:");
        System.out.println("Talk Minutes Used >>>");
        int talkMinutes = userInput.nextInt();

        System.out.println("Text Messages Sent >>>");
        int textMessages = userInput.nextInt();

        System.out.println("Gigabytes Used >>>");
        int gigabytesUsed = userInput.nextInt();

        String output = "We recommend\n";

        if (talkMinutes < 500) {
            if (textMessages == 0 && gigabytesUsed == 0)
                output += "Plan A @ $49 per month";
            else
                output += "Plan B @ $55 per month";
        } else {
            if (textMessages <= 100 && gigabytesUsed == 0)
                output += "Plan C @ $61 per month";
            else if (textMessages > 100 && gigabytesUsed == 0)
                output += "Plan D @ $70 per month";
            else if (textMessages <= 100 && gigabytesUsed <= 2)
                output += "Plan E @ $79 per month";
            else
                output += "Plan F @ $87 per month";
        }

        System.out.println(output);
    }
}
