package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JHistoricalFacts extends JFrame implements ActionListener {

    JLabel[] historicalFacts = new JLabel[] {
        new JLabel("Turkeys Were Once Worshipped Like Gods"),
        new JLabel("Paul Revere Never Actually Shouted, 'The British Are Coming!'"),
        new JLabel("The Olympics Used to Award Medals for Art."),
        new JLabel("One Time, 100 Impostors Claimed to Be Marie Antoinette’s Dead Son"),
        new JLabel("Napoleon Was Once Attacked By a Horde of Bunnies")
    };

    String[] spareFacts = new String[] {
        "Women Were Once Banned from Smoking in Public",
        "The Government Literally Poisoned Alcohol During Prohibition",
        "Captain Morgan Actually Existed",
        "Using Forks Used to Be Seen as Sacrilegious",
        "The Titanic‘s Owners Never Said the Ship Was 'Unsinkable'",
        "There Were More Than 600 Plots to Kill Fidel Castro",
        "Cleopatra Was Not Egyptian",
        "Pope Gregory IV Declared a War On Cats"
    };

    public JHistoricalFacts() {

        super("JHistoricalFacts");
        setSize(500, 500);
        setLayout(new GridLayout(6, 1));

        for (JLabel historicalFact: historicalFacts) {
            add(historicalFact);
        }

        JButton jButton = new JButton("Press to change");
        add(jButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jButton.addActionListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JHistoricalFacts();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        historicalFacts[random.nextInt(historicalFacts.length)].setText(spareFacts[random.nextInt(spareFacts.length)]);
    }
}
