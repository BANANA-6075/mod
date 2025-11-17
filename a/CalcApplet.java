/*
<applet code="CalcApplet.class" width="400" height="300"></applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CalcApplet extends Applet implements ActionListener {
    
    TextField t1, t2, result;
    Button add, sub, mul, div;

    public void init() {

        // Create TextFields
        t1 = new TextField(10);
        t2 = new TextField(10);
        result = new TextField(10);
        result.setEditable(false);

        // Create Buttons
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        // Add components to Applet
        add(t1);
        add(t2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(result);

        // Register listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        // Get numbers
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int r = 0;

        // Check which button clicked
        if (e.getSource() == add) {
            r = a + b;
        } else if (e.getSource() == sub) {
            r = a - b;
        } else if (e.getSource() == mul) {
            r = a * b;
        } else if (e.getSource() == div) {
            if (b != 0)
                r = a / b;
            else
                r = 0;
        }

        result.setText(String.valueOf(r));
    }
}
