import javax.swing.*;
import java.awt.*;

public class SwingDemoCustomShape extends JPanel {

    // Custom painting method
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Define the coordinates for the custom shape
        int x[] = {200, 300, 300, 200, 100, 100};
        int y[] = {0, 100, 500, 700, 500, 100};

        // Set a custom color
        g.setColor(Color.BLUE);

        // Draw the polygon
        g.drawPolygon(x, y, x.length);

        // Fill the polygon (optional)
        g.setColor(new Color(255, 100, 100, 150)); // semi-transparent red
        g.fillPolygon(x, y, x.length);
        g.fillArc(100,120,130,140,150,160);
    }

    // Main method to run the Swing application
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Custom Shape Demo");
        SwingDemoCustomShape panel = new SwingDemoCustomShape();

        // Set up the JFrame
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

