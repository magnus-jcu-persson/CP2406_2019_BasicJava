package week3;

import java.util.Random;

public class Game {
    private Random random = new Random();
    Integer secret;

    Integer count = 0;
    Integer wins = 0;

    public Game(Integer min, Integer max) {
        secret = random.nextInt(max - min + 1);
    }

    void makeGuess(int value) {
        count += 1;
        if (value == secret) {
            wins += 1;
        }
    }
}
