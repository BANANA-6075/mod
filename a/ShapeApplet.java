/*
<applet code="ShapeApplet.class" width="500" height="500">

    <!-- Rectangle parameters -->
    <param name="rx" value="50">
    <param name="ry" value="60">
    <param name="rwidth" value="200">
    <param name="rheight" value="120">

    <!-- Circle parameters -->
    <param name="cx" value="200">
    <param name="cy" value="300">
    <param name="radius" value="60">

</applet>
*/

import java.applet.*;
import java.awt.*;

public class ShapeApplet extends Applet {

    int rx, ry, rwidth, rheight;
    int cx, cy, radius;

    public void init() {
        // Rectangle parameters
        rx = Integer.parseInt(getParameter("rx"));
        ry = Integer.parseInt(getParameter("ry"));
        rwidth = Integer.parseInt(getParameter("rwidth"));
        rheight = Integer.parseInt(getParameter("rheight"));

        // Circle parameters
        cx = Integer.parseInt(getParameter("cx"));
        cy = Integer.parseInt(getParameter("cy"));
        radius = Integer.parseInt(getParameter("radius"));
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);

        // Draw rectangle
        g.drawRect(rx, ry, rwidth, rheight);

        // Draw circle (oval with equal width & height)
        g.setColor(Color.red);
        g.drawOval(cx, cy, radius, radius);
    }
}
