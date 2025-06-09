import javax.swing.*;
import java.awt.*;


public class AppletDemoSwing extends JFrame {
    public AppletDemoSwing() {
        setTitle("Hello World Swing");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("Hello World!", 100, 150);
            }
        };

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AppletDemoSwing();
    }
}


