package week10;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class JFontSelector extends JFrame {

    private JLabel exampleLabel;
    private Boolean fontIsLarge = false;
    private Font currentFont;
    private Integer fontSize = 8;
    private String fontType = Font.DIALOG;

    private JFontSelector() {
        super("JFontSelector");

        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        exampleLabel = new JLabel("Demonstration Text");
        currentFont = new Font("Dialog", Font.PLAIN, fontSize);
        exampleLabel.setFont(currentFont);
        add(exampleLabel, BorderLayout.NORTH);

        JButton dialogButton = new JButton("Dialog");
        JButton sansSerifButton = new JButton("SansSerif");
        JButton serifButton = new JButton("Serif");
        JButton monospacedButton = new JButton("Monospaced");
        JButton dialogInputButton = new JButton("DialogInput");
        JButton sizeButton = new JButton("Change Size");

        JPanel southPanel = new JPanel();
        add(southPanel, BorderLayout.SOUTH);
        southPanel.add(dialogButton, BorderLayout.SOUTH);
        southPanel.add(sansSerifButton, BorderLayout.SOUTH);
        southPanel.add(serifButton, BorderLayout.SOUTH);
        southPanel.add(monospacedButton, BorderLayout.SOUTH);
        southPanel.add(dialogInputButton, BorderLayout.SOUTH);
        southPanel.add(sizeButton, BorderLayout.SOUTH);

        dialogButton.addActionListener(e -> {
            setFont(Font.DIALOG);
        });

        sansSerifButton.addActionListener(e -> {
            setFont(Font.SANS_SERIF);
        });

        serifButton.addActionListener(e -> {
            setFont(Font.SERIF);
        });

        monospacedButton.addActionListener(e -> {
            setFont(Font.MONOSPACED);
        });

        dialogInputButton.addActionListener(e -> {
            setFont(Font.DIALOG_INPUT);
        });

        sizeButton.addActionListener(e -> {
            toggleFontSize();
        });

        setVisible(true);
    }

    private void setFont(String fontType) {
        this.fontType = fontType;
        currentFont = new Font(fontType, Font.PLAIN, fontSize);
        exampleLabel.setFont(currentFont);
    }

    private void toggleFontSize() {
        if (fontIsLarge) {
            fontIsLarge = false;
            fontSize = 8;
        } else {
            fontIsLarge = true;
            fontSize = 24;
        }
        Font newFont = new Font(fontType, Font.PLAIN, fontSize);
        exampleLabel.setFont(newFont);
    }

    public static void main(String[] args) {
        new JFontSelector();
    }
}
