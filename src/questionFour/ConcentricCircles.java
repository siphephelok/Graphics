package questionFour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConcentricCircles extends JPanel {
    private final static int RADIUS1 = 200;
    private final static int RADIUS2 = 220;

    public ConcentricCircles(){
        setLayout(new BorderLayout());
        JLabel label = new JLabel("COMP200 2024", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 30));
        label.setForeground(Color.BLUE);
        add(label, BorderLayout.SOUTH);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // Get the y-coordinate of the mouse click
                int clickY = e.getY();
                // Get the height of the panel
                int height = getHeight();

                // Determine whether the click was in the upper or lower half
                if (clickY < height / 2) {
                    JOptionPane.showMessageDialog(null,"Clicked in top half");
                } else {
                    JOptionPane.showMessageDialog(null,"Clicked in bottom half");
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Calculate center of the panel
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.setColor(Color.RED);
        // Draw the second circle
        g.fillOval(x - RADIUS2, y - RADIUS2, RADIUS2 * 2, RADIUS2 * 2);
        g.setColor(Color.GREEN);
        // Draw the first circle
        g.fillOval(x - RADIUS1, y - RADIUS1, RADIUS1 * 2, RADIUS1 * 2);
    }
}
