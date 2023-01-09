
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class Vis extends JPanel {

    private Color currentColor;

    public Vis() {
        super();
        currentColor = Color.YELLOW;
        
    }

    @Override
    public void paintComponent(Graphics g1) {
        //TODO typecast Graphics to Graphics2D
        //TODO draw some simple shapes

        g1.setColor(currentColor);
        g1.fillOval(150,150,100,100);
    }

    public void setCircleColor(Color c) {
        currentColor = c;
        repaint();
    }

}