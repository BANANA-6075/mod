import java.applet.*;
import java.awt.*;


public class KiteApplet extends Applet {

    public void paint(Graphics g) {

        // Set drawing color (BLUE)
        g.setColor(new Color(0, 0, 255));

        // Coordinates for the kite
        int x[] = {150, 250, 150, 50};   // X-coordinates
        int y[] = {50, 150, 250, 150};   // Y-coordinates

        // Draw kite outline
        g.drawPolygon(x, y, 4);

        // Fill inside
        g.setColor(new Color(135, 206, 235)); 
        g.fillPolygon(x, y, 4);

        // Tail color (RED)
        g.setColor(new Color(255, 0, 0));

        // Kite tail
        g.drawLine(150, 250, 150, 320);
        g.drawLine(150, 320, 140, 340);
        g.drawLine(150, 320, 160, 340);
    }
}

/*    
	<applet code="KiteApplet.class" width="400" height="400">
        </applet>
*/
