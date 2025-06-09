import javax.swing.*;
import java.awt.*;

public class AppletDemoSwing2 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello World!", 100, 150);
        g.drawLine(150, 300, 250, 300);
        g.drawLine(170, 360, 260, 570);
        g.drawRect(150, 300, 100, 100);
        g.drawRect(220, 200, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Version");
        AppletDemoSwing panel = new AppletDemoSwing();

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

