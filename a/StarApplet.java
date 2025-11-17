/*
<applet code="StarApplet.class" width="400" height="400"></applet>
*/

import java.applet.*;
import java.awt.*;

public class StarApplet extends Applet {

    public void paint(Graphics g) {

        // simple star points
        int x[] = {200, 230, 300, 245, 260, 200, 140, 155, 100, 170};
        int y[] = { 80, 150, 150, 190, 260, 210, 260, 190, 150, 150};

        g.setColor(Color.blue);
        g.drawPolygon(x, y, 10);

	g.setColor(Color.black);
	g.drawRect(50,50,300,300);
    }
}
