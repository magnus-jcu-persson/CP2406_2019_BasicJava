package week5;

import java.util.Scanner;

public class CondoSales {
    private static int price;
    private static int[] priceList = {
            150000,
            170000,
            210000
    };

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Choose from the following:");
        System.out.println("1 for Park View");
        System.out.println("2 for Golf Course View");
        System.out.println("3 for Lake View");

        int userChoice = userInput.nextInt();

        if ((userChoice < 1) || (userChoice > 3)) {
            price = 0;
        } else {
            price = priceList[userChoice - 1];
        }

        System.out.println("Price is $" + price);

    }
}
