package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class JTVDownload2 extends JFrame implements ActionListener {

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
    JLabel jLabel = new JLabel("Search TV Show");

    JTVDownload2() {
        super("JTVDownload2");
        setSize(800, 600);
        setLayout(new GridLayout(6, 1));

        JComboBox searchShow = new JComboBox();
        searchShow.setEditable(true);
        searchShow.addActionListener(this);
        add(searchShow);


        add(jLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JTVDownload2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JComboBox searchShow = (JComboBox)e.getSource();
        String searchResult = (String)searchShow.getEditor().getItem();

        System.out.println(searchResult);

        Boolean found = false;
        for (Map.Entry<String, String> tvShow : tvShowInfo.entrySet()) {
            if (tvShow.equals(searchResult)) {
                found = true;
                jLabel.setText(tvShow.getValue());
            }
        }

        if (!found) {
            jLabel.setText("Sorry, couldn't find that show.");
        }

    }
}
