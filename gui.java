import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    public class gui {
        public gui() {
            JFrame startFrame = new JFrame("Budget App Homescreen");
            startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            startFrame.setSize(800,800);
            startFrame.setLayout(new BorderLayout());

            JLabel titleLabel = new JLabel("Budget App");
            titleLabel.setFont(new Font("Seriff", Font.BOLD, 24));
            startFrame.add(titleLabel, BorderLayout.CENTER);

            JButton startButton = new JButton("Start App");
            startButton.setFont(new Font("Arial", Font.BOLD, 18));
            startButton.setFocusPainted(false);

            startButton.addActionListener(new ActionListener(){
                @Override
                    public void actionPerformed(ActionEvent e) {
                        new budget();
                        startFrame.dispose();
                    }
            });
            startFrame.add(startButton, BorderLayout.SOUTH);
            startFrame.setLocationRelativeTo(null);
            startFrame.setVisible(true);

        }
    }
