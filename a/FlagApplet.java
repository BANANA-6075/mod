/*
<applet code="FlagApplet.class" width="500" height="350"></applet>
*/

import java.applet.*;
import java.awt.*;

public class FlagApplet extends Applet {

    public void paint(Graphics g) {

        // Saffron stripe
        g.setColor(Color.orange);
        g.fillRect(50, 50, 300, 60);

        // White stripe
        g.setColor(Color.white);
        g.fillRect(50, 110, 300, 60);

        // Green stripe
        g.setColor(Color.green);
        g.fillRect(50, 170, 300, 60);

        // Ashoka Chakra (simple circle + 24 lines)
        g.setColor(Color.blue);
        g.drawOval(160, 110, 80, 80);

        // spokes (simple)
        for (int i = 0; i < 24; i++) {
            double angle = Math.toRadians(i * 15);
            int x = 200 + (int)(40 * Math.cos(angle));
            int y = 150 + (int)(40 * Math.sin(angle));
            g.drawLine(200, 150, x, y);
        }
    }
}
