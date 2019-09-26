package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {

    JButton jButton = new JButton("Disable");

    public JFrameDisableButton() {
        super("JFrameDisableButton");
        setSize(300, 100);
        setLayout(new FlowLayout());
        setVisible(true);

        add(jButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jButton.addActionListener(this);
    }

    public static void main(String[] args) {
        new JFrameDisableButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jButton.setEnabled(false);
    }
}
