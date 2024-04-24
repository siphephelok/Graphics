package example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    private int count = 1;

    public GUI() {
        JFrame frame = new JFrame();
        frame.setTitle("GUI Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Set up the main panel with BorderLayout
        JPanel panel = new JPanel(new BorderLayout());

        JButton button = new JButton("Click me");
        JLabel label = new JLabel();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "I have been clicked.");
                label.setText("Clicks: I have been clicked " + count + " time/s");
                count++;
            }
        });

        // Adding components to specific regions
        panel.add(button, BorderLayout.NORTH);
        panel.add(label, BorderLayout.SOUTH);

        // Create an instance of the Shape class
        Shape s = new Shape();
        panel.add(s, BorderLayout.CENTER);  // Adds Shape at the center

        frame.add(panel);
        frame.setVisible(true);
    }

    // Inner class for drawing a shape
    class Shape extends JPanel {
        Shape() {
            setPreferredSize(new Dimension(150, 150));  // Set the preferred size
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.red);
            g.fillRect(50, 50, 100, 100);  // Drawing the rectangle

        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
