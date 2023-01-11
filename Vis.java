
import javax.swing.*;
import java.awt.*;


public class Vis extends JPanel {

    private Color currentColor;
    private Stroke lineWidth;

    public Vis() {
        super();
        currentColor = Color.YELLOW;
        lineWidth = new BasicStroke(10);


        
    }

    @Override
    public void paintComponent(Graphics g1) {
        //TODO draw some simple shapes

        //TODO typecast Graphics to Graphics2D
        Graphics2D g = (Graphics2D)g1;

   
        // Draw the stem.
        g.setStroke(
            new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g.setColor(new Color(0, 128, 0));  // green
        g.drawLine(toScreenX(100), toScreenY(190), toScreenX(100), toScreenY(70));

        // Draw the center.
        g.setColor(new Color(255, 165, 0));  // orange
        g.fillOval(toScreenX(75), toScreenY(45), toScreenX(50), toScreenY(50));

        // Draw eight petals at N, NE, E, SE, S, SW, W, NW positions on the center.
        int petalWidth = toScreenX(20);
        int petalHeight = toScreenY(20);
        g.setColor(currentColor);  // pink
        g.fillOval(toScreenX(90), toScreenY(35), petalWidth, petalHeight);
        g.fillOval(toScreenX(90), toScreenY(85), petalWidth, petalHeight);
        g.fillOval(toScreenX(64), toScreenY(60), petalWidth, petalHeight);
        g.fillOval(toScreenX(115), toScreenY(60), petalWidth, petalHeight);
        g.fillOval(toScreenX(108), toScreenY(78), petalWidth, petalHeight);
        g.fillOval(toScreenX(108), toScreenY(42), petalWidth, petalHeight);
        g.fillOval(toScreenX(72), toScreenY(78), petalWidth, petalHeight);
        g.fillOval(toScreenX(72), toScreenY(42), petalWidth, petalHeight);
    }

    public void setCircleColor(Color c) {
        currentColor = c;
        repaint();
    }

      /** Converts an x-coordinate from a 200-width screen to the actual width. */
    private int toScreenX(int x) {
        return Math.round(x * getWidth() / 200f);
    }

    /** Converts an y-coordinate from a 200-width screen to the actual width. */
    private int toScreenY(int y) {
        return Math.round(y * getHeight() / 200f);
    }

}