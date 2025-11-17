/* Write a swing program to accept an integer in a textbox then reverse that number and display the result in the second textbox?  */



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberSwing extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton b;

    ReverseNumberSwing() {

        setTitle("Reverse Number");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // MUST USE getContentPane()
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("Enter Number:"));
        t1 = new JTextField(10);
        c.add(t1);

        c.add(new JLabel("Reversed Number:"));
        t2 = new JTextField(10);
        t2.setEditable(false);
        c.add(t2);

        b = new JButton("Reverse");
        c.add(b);

        b.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String s = t1.getText();
        String rev = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        t2.setText(rev);
    }

    public static void main(String args[]) {
        new ReverseNumberSwing();
    }
}

