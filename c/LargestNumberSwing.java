/*Write a program using swing to accept values in two textboxes then find the largest number and display the result in third text box.  */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LargestNumberSwing extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b;

    LargestNumberSwing() {

        // Set layout for content pane
        getContentPane().setLayout(new FlowLayout());

        l1 = new JLabel("Enter First Number:");
        l2 = new JLabel("Enter Second Number:");
        l3 = new JLabel("Largest Number:");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false);

        b = new JButton("Find Largest");

        // Add components using getContentPane()
        getContentPane().add(l1);
        getContentPane().add(t1);

        getContentPane().add(l2);
        getContentPane().add(t2);

        getContentPane().add(l3);
        getContentPane().add(t3);

        getContentPane().add(b);

        b.addActionListener(this);

        setSize(300, 200);
        setTitle("Largest Number Finder");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        int largest = (a > b) ? a : b;

        t3.setText(String.valueOf(largest));
    }

    public static void main(String args[]) {
        new LargestNumberSwing();
    }
}
