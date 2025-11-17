/*
<applet code="TrafficLightApplet.class" width="300" height="500">
</applet>
*/

import java.applet.*;
import java.awt.*;

public class TrafficLightApplet extends Applet {

    public void paint(Graphics g) {

        // Draw outer box
        g.setColor(Color.black);
        g.drawRect(80, 50, 140, 360);
        g.drawRect(81, 51, 138, 358);   // double border for clarity

        // Draw Red light
        g.setColor(Color.red);
        g.fillOval(110, 80, 80, 80);

        // Draw Yellow light
        g.setColor(Color.yellow);
        g.fillOval(110, 180, 80, 80);

        // Draw Green light
        g.setColor(Color.green);
        g.fillOval(110, 280, 80, 80);
    }
}
