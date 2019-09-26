package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class JVacationRental extends JFrame implements ActionListener {

    ButtonGroup locations = new ButtonGroup();
    ButtonGroup numberBedrooms = new ButtonGroup();
    ButtonGroup mealsIncluded = new ButtonGroup();

    Map<String, Integer> locationInfo = Map.of(
            "Park-side", 600,
            "Pool-side", 750,
            "Lake-side", 825
    );
    JLabel jLabel = new JLabel("Choose rental options");

    private JVacationRental() {

        super("JHistoricalFacts");
        setSize(500, 500);
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        for (Map.Entry<String, Integer> location : locationInfo.entrySet()) {
            JCheckBox jCheckBox = new JCheckBox(location.getKey());
            jCheckBox.setActionCommand(jCheckBox.getText());
            locations.add(jCheckBox);
            add(jCheckBox, gridBagConstraints);
            jCheckBox.addActionListener(this);
            gridBagConstraints.gridx++;
        }

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        for (int i = 0; i < 3; i++) {
            JCheckBox jCheckBox = new JCheckBox((i + 1) + " Bedrooms");
            jCheckBox.setActionCommand(Integer.toString(i + 1));
            numberBedrooms.add(jCheckBox);
            add(jCheckBox, gridBagConstraints);
            jCheckBox.addActionListener(this);
            gridBagConstraints.gridy++;
        }

        gridBagConstraints.gridx = locationInfo.size() - 1;
        gridBagConstraints.gridy = 1;
        JCheckBox includedCheckBox = new JCheckBox("Meals Included");
        mealsIncluded.add(includedCheckBox);
        includedCheckBox.setActionCommand("include");
        add(includedCheckBox, gridBagConstraints);
        includedCheckBox.addActionListener(this);

        gridBagConstraints.gridy++;
        JCheckBox notIncludedCheckBox = new JCheckBox("Meals NOT Included");
        mealsIncluded.add(notIncludedCheckBox);
        add(notIncludedCheckBox, gridBagConstraints);
        includedCheckBox.addActionListener(this);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;

        add(jLabel, gridBagConstraints);

        setVisible(true);

    }

    public static void main(String[] args) {
        new JVacationRental();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ButtonModel location = locations.getSelection();
        ButtonModel numberBedroom = numberBedrooms.getSelection();
        ButtonModel mealIncluded = mealsIncluded.getSelection();

        Integer price = 0;
        if (location != null) {
            String locationKey = location.getActionCommand();
            price += locationInfo.get(locationKey);
        }

        if (numberBedroom != null) {
            int numberBedroomMultiplier = Integer.parseInt(numberBedroom.getActionCommand());
            price += 75 * numberBedroomMultiplier;
        }

        if (mealIncluded != null) {
            if (mealIncluded.getActionCommand().equals("include"))
                price += 200;
        }

        jLabel.setText("Rental price is " + price);

    }
}
