package questionTwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        setTitle("WidgetTest");
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MyPanel extends JPanel{
    Color current = Color.red;
    JButton button = new JButton("Button");
    class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            current = Color.green;
            repaint();
        }
    }
    class MouseHandler extends MouseAdapter{
        public void mouseClicked(MouseEvent ev){
            if(ev.getX() <= 150) current = Color.BLACK;
            if(ev.getX() >= 150) current = Color.BLUE;
            repaint();
        }
    }
    MyPanel(){
        button.addActionListener(new ButtonHandler());
        addMouseListener(new MouseHandler());
        add(button);
        button.setFocusable(false);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(current);
        g.fillRect(0, 100, 400, 400);
    }
}


