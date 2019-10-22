package week9;

import javax.swing.*;
import java.awt.*;

public class JMovieFrame extends JFrame {
    public JMovieFrame() {
        super("JMovieFrame");

        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        JPanel westPanel = new JPanel();

        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        add(eastPanel, BorderLayout.EAST);
        add(westPanel, BorderLayout.WEST);

        JButton northButton = new JButton("Rocky");
        JButton southButton = new JButton("Finding Nemo");
        JButton eastButton = new JButton("Iron Man");
        JButton westButton = new JButton("Abyss");

        northPanel.add(northButton);
        southPanel.add(southButton);
        eastPanel.add(eastButton);
        westPanel.add(westButton);

        northButton.addActionListener(e -> {
            northButton.setText("1976 - Sylvester Stallone");
        });

        southButton.addActionListener(e -> {
            southButton.setText("2003 - Albert Brooks");
        });

        eastButton.addActionListener(e -> {
            eastButton.setText("2008 - Robert Downey Jr.");
        });

        westButton.addActionListener(e -> {
            westButton.setText("2019 - Park Bo-young");
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new JMovieFrame();
    }
}
