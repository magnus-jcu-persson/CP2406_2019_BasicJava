package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class JTVDownload extends JFrame implements ActionListener {

    ButtonGroup tvShows = new ButtonGroup();

    Map<String, String> tvShowInfo = Map.of(
            "Game of Thrones", "Nine noble families fight for control over the mythical lands of Westeros, " +
                    "while an ancient enemy returns after being dormant for thousands of years.",
            "Stranger Things", "When a young boy disappears, his mother, a police chief, " +
                    "and his friends must confront terrifying supernatural forces in order to get him back.",
            "The Good Place", "Four people and their otherworldly frienemy " +
                    "struggle in the afterlife to define what it means to be good.",
            "The Crown", "Follows the political rivalries and romance of Queen Elizabeth II's " +
                    "reign and the events that shaped the second half of the twentieth century.",
            "Black Mirror", "An anthology series exploring a twisted, high-tech world where " +
                    "humanity's greatest innovations and darkest instincts collide."
    );
    JLabel jLabel = new JLabel("Choose TV Show");

    JTVDownload() {
        super("JTVDownload");
        setSize(800, 600);
        setLayout(new GridLayout(6, 1));

        for (Map.Entry<String, String> tvShow : tvShowInfo.entrySet()) {
            JCheckBox jCheckBox = new JCheckBox(tvShow.getKey());
            jCheckBox.setActionCommand(jCheckBox.getText());
            tvShows.add(jCheckBox);
            add(jCheckBox);
            jCheckBox.addActionListener(this);
        }

        add(jLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JTVDownload();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ButtonModel tvShow = tvShows.getSelection();

        if (tvShow != null) {
            String tvShowKey = tvShow.getActionCommand();
            jLabel.setText(tvShowInfo.get(tvShowKey));
        }


    }
}
