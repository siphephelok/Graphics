package questionTwo;

import java.awt.*;

public class WidgetTest {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setLocationRelativeTo(null);
        Container contentPane = myFrame.getContentPane();
        contentPane.add(new MyPanel());
        myFrame.setVisible(true);
    }
}
