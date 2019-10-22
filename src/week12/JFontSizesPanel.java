package week12;

import javax.swing.*;
import java.awt.*;

public class JFontSizesPanel extends JPanel {
    public JFontSizesPanel() {
        setLayout(new GridLayout(0, 15));

        for (int f = 6; f <= 20; f++) {
            JLabel label = new JLabel(String.valueOf(f));
            Font font = new Font("Dialog", Font.PLAIN, f);
            label.setFont(font);
            add(label);
        }
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800, 600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFontSizesPanel jFontSizesPanel = new JFontSizesPanel();
        jFrame.add(jFontSizesPanel);
        jFrame.setVisible(true);
    }
}
