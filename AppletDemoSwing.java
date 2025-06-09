import javax.swing.*;
import java.awt.*;

public class SwingDemo extends JPanel {

    // Custom painting method
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the same shapes and text
        g.drawString("Hello World!", 100, 150);
        g.drawLine(150, 300, 250, 300);
        g.drawLine(170, 360, 260, 570);
        g.drawRect(150, 300, 250, 300);
        g.drawRect(220, 200, 250, 300);

        // Set color to red and draw a rectangle with it
        g.setColor(Color.RED);
        g.fillRect(100, 100, 50, 50);
    }

    // Main method to run the Swing application
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Version");
        SwingDemo panel = new SwingDemo();

        // Set up the JFrame
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

