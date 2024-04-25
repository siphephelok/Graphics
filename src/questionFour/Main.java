package questionFour;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Concentric Circles");
        ConcentricCircles concentricCircles = new ConcentricCircles();
        frame.add(concentricCircles);
        frame.setVisible(true);
    }
}
