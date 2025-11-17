/* 
<applet code="PieChartApplet.class" width="500" height="500"></applet>
*/

import java.applet.*;
import java.awt.*;

public class PieChartApplet extends Applet {

    public void paint(Graphics g) {

        // Values for the years 2010, 2011, 2012
        int v1 = 90;   // 2010
        int v2 = 80;   // 2011
        int v3 = 95;   // 2012

        // Total value
        int total = v1 + v2 + v3;

        // Convert values to angles
        int a1 = (v1 * 360) / total;
        int a2 = (v2 * 360) / total;
        int a3 = (v3 * 360) / total;

        // Draw pie chart
        g.setColor(Color.red);
        g.fillArc(100, 100, 250, 250, 0, a1);

        g.setColor(Color.blue);
        g.fillArc(100, 100, 250, 250, a1, a2);

        g.setColor(Color.green);
        g.fillArc(100, 100, 250, 250, a1 + a2, a3);

        // Labels
        g.setColor(Color.black);
        g.drawString("2010 = 90", 380, 130);
        g.drawString("2011 = 80", 380, 150);
        g.drawString("2012 = 95", 380, 170);
    }
}
