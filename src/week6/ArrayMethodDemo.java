package week6;

public class ArrayMethodDemo {


    public static void main(String[] args) {

        int[] arrayIntegers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        displayIntegers(arrayIntegers);
        displayIntegersReverse(arrayIntegers);
        sumIntegers(arrayIntegers);
        displayLimitedIntegers(arrayIntegers);
        displayHigherThanAvgIntegers(arrayIntegers);

    }
    static void displayIntegers(int[] arrayIntegers) {
        System.out.println("displayIntegers");
        for (int integer: arrayIntegers ) {
            System.out.println(integer);
        }
    }

    private static void displayIntegersReverse(int[] arrayIntegers) {
        System.out.println("displayIntegersReverse");
        for (int x = arrayIntegers.length - 1; x > 0; x--) {
            System.out.println(arrayIntegers[x]);
        }
    }

    private static void sumIntegers(int[] arrayIntegers) {
        System.out.println("sumIntegers");
        int sum = 0;
        for (int integer: arrayIntegers) {
            sum += integer;
        }
        System.out.println("Sum: " + sum);
    }

    private static void displayLimitedIntegers(int[] arrayIntegers) {
        System.out.println("displayLimitedIntegers");
        final int LIMITER = 5;
        for (int integer: arrayIntegers) {
            if (integer < LIMITER) {
                System.out.println(integer);
            }
        }
    }

    private static void displayHigherThanAvgIntegers(int[] arrayIntegers) {
        System.out.println("displayHigherThanAvgIntegers");
        int sum = 0;
        for (int integer: arrayIntegers) {
            sum += integer;
        }
        int avg = sum / arrayIntegers.length;

        for (int integer: arrayIntegers) {
            if (integer > avg) {
                System.out.println(integer);
            }
        }
    }
}
