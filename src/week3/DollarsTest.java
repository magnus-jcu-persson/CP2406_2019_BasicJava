package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarsTest {

    @Test
    void printDenominations() {
        Dollars dollars = new Dollars();
        dollars.printDenominations(111);
    }

    @Test
    void subtractNotes() {
        Dollars dollars = new Dollars();
        int remainder = dollars.subtractNotes(111, 20);
        assertEquals(11, remainder);
    }
}