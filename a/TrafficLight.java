/*
<applet code="TrafficLight.class" width="300" height="400">
</applet>
*/

import java.applet.*;
import java.awt.*;

public class TrafficLight extends Applet implements Runnable {

    Thread t;
    int state = 0;   // 0 = Red, 1 = Yellow, 2 = Green

    public void init() {
        setBackground(Color.white);
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                state = (state + 1) % 3;   // Change light
                repaint();
                Thread.sleep(1000);        // 1 second delay
            }
        } catch (Exception e) {}
    }

    public void paint(Graphics g) {

        // Draw traffic light box
        g.setColor(Color.black);
        g.fillRect(100, 50, 100, 260);

        // RED light
        if (state == 0)
            g.setColor(Color.red);
        else
            g.setColor(Color.darkGray);
        g.fillOval(125, 70, 50, 50);

        // YELLOW light
        if (state == 1)
            g.setColor(Color.yellow);
        else
            g.setColor(Color.darkGray);
        g.fillOval(125, 140, 50, 50);

        // GREEN light
        if (state == 2)
            g.setColor(Color.green);
        else
            g.setColor(Color.darkGray);
        g.fillOval(125, 210, 50, 50);
    }
}
