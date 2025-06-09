import javax.swing.*;
import java.awt.*;

public class SwingDemoRoundedRect extends JPanel {

    // Custom painting method
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Define the coordinates for the custom shape
        int x[] = {300, 200, 200, 200, 300, 200};
        int y[] = {0, 100, 400, 500, 500, 800};

        // Set a custom color
        g.setColor(Color.BLUE);

        // Draw the polygon
        g.drawPolygon(x, y, x.length);

        // Fill the polygon (optional)
        g.setColor(new Color(255, 100, 100, 150)); // semi-transparent red
        g.fillPolygon(x, y, x.length);
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

