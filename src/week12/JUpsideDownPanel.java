package week12;

import javax.swing.*;
import java.awt.*;

public class JUpsideDownPanel extends JPanel {

    String phrase = "New Phrase";
    Integer rotation = 0;

    public void toggleRotate() {
        rotation = rotation + 180;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gr2D = (Graphics2D) g;
        gr2D.rotate(Math.toDegrees(90));
        gr2D.drawString(phrase, 100, 100);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new BorderLayout());
        jFrame.setSize(800, 600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jButton = new JButton("Rotate");
        jFrame.add(jButton, BorderLayout.SOUTH);

        JPanel jPanel = new JPanel();
        JUpsideDownPanel jUpsideDownPanel = new JUpsideDownPanel();
        jPanel.add(jUpsideDownPanel);
        jFrame.add(jPanel, BorderLayout.NORTH);



        jButton.addActionListener(e -> {
            System.out.println("Pressed");
            jUpsideDownPanel.toggleRotate();
            jFrame.validate();
            jFrame.repaint();
        });
        jFrame.setVisible(true);
    }
}
