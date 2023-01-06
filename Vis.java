
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class Vis extends JPanel {

    private Color yellow;

    public Vis() {
        super();
        yellow = Color.YELLOW;
        
    }

    @Override
    public void paintComponent(Graphics g1) {
        //TODO typecast Graphics to Graphics2D
        //TODO draw some simple shapes

        g1.setColor(yellow);
        g1.fillOval(50,50,100,100);
    }

}