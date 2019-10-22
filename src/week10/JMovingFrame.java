package week10;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JMovingFrame extends JFrame {

    private JPanel[] borderPanels = new JPanel[4];

    public JMovingFrame() {

        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        for (int i = 0; i < 4; i++) {
            borderPanels[i] = new JPanel();
        }

        add(borderPanels[0], BorderLayout.NORTH);
        add(borderPanels[1], BorderLayout.SOUTH);
        add(borderPanels[2], BorderLayout.EAST);
        add(borderPanels[3], BorderLayout.WEST);

        JLabel theLabel = new JLabel("The Label");
        borderPanels[0].add(theLabel);

        JButton theButton = new JButton("Press me");
        add(theButton, BorderLayout.CENTER);

        theButton.addActionListener(e -> {
            for (int i = 0; i < 4; i++) {
                for (Component oldComponent : borderPanels[i].getComponents()) {
                    borderPanels[i].remove(oldComponent);
                }
            }

            Random random = new Random();
            borderPanels[random.nextInt(4)].add(theLabel);

            validate();
            repaint();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        JMovingFrame jMovingFrame = new JMovingFrame();
    }

}
