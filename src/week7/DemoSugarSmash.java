package week7;

public class DemoSugarSmash {
    public static void main(String[] args) throws Exception {
        SugarSmashPlayer basicSmashPlayerOne = new SugarSmashPlayer();
        PremiumSugarSmashPlayer premiumSugarSmashPlayerTwo = new PremiumSugarSmashPlayer();

        basicSmashPlayerOne.setPlayerID(666);
        basicSmashPlayerOne.setScreenName("Damian");

        premiumSugarSmashPlayerTwo.setPlayerID(111);
        premiumSugarSmashPlayerTwo.setScreenName("Troy");

        basicSmashPlayerOne.setHighScore(0, 110);
        premiumSugarSmashPlayerTwo.setHighScore(0, 99);

        basicSmashPlayerOne.setHighScore(1, 150);
        try {
            premiumSugarSmashPlayerTwo.setHighScore(1, 200);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        premiumSugarSmashPlayerTwo.setHighScore(0, 100);
        premiumSugarSmashPlayerTwo.setHighScore(1, 200);
        try {
            basicSmashPlayerOne.setHighScore(5, 500);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        try {
            basicSmashPlayerOne.setHighScore(40, 20);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }

        try {
            premiumSugarSmashPlayerTwo.setHighScore(40, 20);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
}
