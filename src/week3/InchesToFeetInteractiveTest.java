package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchesToFeetInteractiveTest {
    @Test
    void convertInchesToFeet() {
        InchesToFeetInteractive inchestofeetinteractive = new InchesToFeetInteractive();
        double feet = inchestofeetinteractive.convertInchesToFeet(100);
        assertEquals(83.333, feet);
    }
}