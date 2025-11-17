/*
<applet code="MouseCoordApplet.class" width="500" height="500">
</applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseCoordApplet extends Applet implements MouseMotionListener {

    int x = 0, y = 0;   // Variables to store mouse coordinates

    public void init() {
        addMouseMotionListener(this);   // Register listener
        setBackground(Color.cyan);      // Optional background
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Mouse Coordinates: (" + x + ", " + y + ")", 20, 20);
    }

    // Called whenever mouse moves
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();  // Refresh applet
    }

    // Not needed but must be declared
    public void mouseDragged(MouseEvent e) { }
}
