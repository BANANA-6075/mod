/*
<applet code="SmileyApplet.class" width="400" height="400"></applet>
*/

import java.applet.*;
import java.awt.*;

public class SmileyApplet extends Applet {

    public void paint(Graphics g) {

        // Face circle
        g.drawOval(100, 100, 200, 200);

        // Eyes
        g.fillOval(150, 160, 20, 20);
        g.fillOval(230, 160, 20, 20);

        // Smile
        g.drawArc(150, 170, 100, 100, 180, 180);
    }
}
