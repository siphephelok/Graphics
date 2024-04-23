import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.setLocationRelativeTo(null);

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}


