package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 extends JFrame implements ActionListener {

    JButton jButton = new JButton("Disable");
    Integer clickCount = 0;

    public JFrameDisableButton2() {
        super("JFrameDisableButton2");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        add(jButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jButton.addActionListener(this);
    }

    public static void main(String[] args) {
        new JFrameDisableButton2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clickCount++;
        if (clickCount >= 10) {
            jButton.setEnabled(false);
            add(new JLabel("That's enough!"));
            revalidate();
        }
    }
}
