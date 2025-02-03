import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class budget extends JPanel {
    private JFrame frame;
    private JLabel totaLabel, spendLabel, weeklyRemainingLabel, daysLeftLabel;
    public budget() {
        frame = new JFrame("Budget Overview");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLayout(new BorderLayout());

        JPanel infoPanel = new JPanel(new GridLayout(1,4));
        totaLabel = new JLabel("Total Budget: 0.00$");
        spendLabel = new JLabel("Total Spent: 0.00$");
        weeklyRemainingLabel = new JLabel("Weekly Budget Remaining $0.00");
        daysLeftLabel = new JLabel("Days remaining in Week: 7");

        infoPanel.add(totaLabel);
        infoPanel.add(spendLabel);
        infoPanel.add(weeklyRemainingLabel);
        infoPanel.add(daysLeftLabel);

        JButton editAmountsButton = new JButton("Edit Amounts");
        editAmountsButton.addActionListener(e -> editBudget());

        frame.add(infoPanel, BorderLayout.CENTER);
        frame.add(editAmountsButton, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    private void editBudget() {
        String[] options = {"Total Amount", "Weekly Allocation",};
                String choice = (String) JOptionPane.showInputDialog(
                        null,
                        "Which Setting Would You Like to Change?",
                        "Settings Selection",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        "Total Amount"
                )
                // add code to edit weekly allocations and total amount
                // look how to have program maintain values/ update itself
        String newBudget = JOptionPane.showInputDialog(frame, "Enter New Total Budget: ");
        if(newBudget != null && !newBudget.isEmpty()) {
            totaLabel.setText("Total Budget: $" + newBudget);
        }
    }
    
}
