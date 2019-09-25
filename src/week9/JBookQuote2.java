package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame implements ActionListener {

    JLabel bookQuote = new JLabel("So many books, so little time.");
    JButton jButton = new JButton("Author");

    public JBookQuote2() {
        super("JBookQuote2");
        setSize(300, 100);
        setLayout(new FlowLayout());
        setVisible(true);

        add(bookQuote);
        add(jButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jButton.addActionListener(this);
    }

    public static void main(String[] args) {
        new JBookQuote2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bookQuote.setText("Frank Zappa");
    }
}
