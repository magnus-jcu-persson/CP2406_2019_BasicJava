package week10;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JColorFrame extends JFrame {

    private JPanel[] borderPanels = new JPanel[4];

    public JColorFrame() {

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

        JButton theButton = new JButton("Press me");
        add(theButton, BorderLayout.CENTER);

        theButton.addActionListener(e -> {
            for (int i = 0; i < 4; i++) {
                borderPanels[i].setBackground(null);
            }

            Random random = new Random();
            borderPanels[random.nextInt(4)].setBackground(Color.BLUE);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        JColorFrame colorFrame = new JColorFrame();
    }
}
