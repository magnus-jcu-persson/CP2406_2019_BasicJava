package week9;

import javax.swing.*;

public class JBookQuote {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JBookQuote");
        jFrame.setSize(300, 100);
        jFrame.setVisible(true);

        JLabel bookQuote = new JLabel("So many books, so little time.");

        jFrame.add(bookQuote);
    }
}
