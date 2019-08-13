package week3;

public class Dollars {
    void printDenominations(int dollars) {

        // - Calculate $20 notes
        int twenty_remainder = subtractNotes(dollars, 20);

        // - Calculate $10 notes
        int ten_remainder = subtractNotes(twenty_remainder, 10);

        // - Calculate $5 notes
        int five_remainder = subtractNotes(ten_remainder, 5);

        // - Calculate $1 notes
        subtractNotes(five_remainder, 1);

    }

    int subtractNotes(int dollars, int note_type) {
        int remainder = dollars % note_type;
        int notes = (dollars - remainder) / note_type;

        System.out.println("$" + note_type + " Notes: " + notes);

        return remainder;
    }
}
