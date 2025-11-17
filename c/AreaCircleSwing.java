/*Write a swing program to accept a value in a textbox then find the area of a circle and display the result in the second textbox? (hint : A = πr2 ) */




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AreaCircleSwing extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton b1;

    public AreaCircleSwing() {

        setTitle("Area of Circle");
        setSize(400, 250);

        getContentPane().setLayout(null);  // IMPORTANT FIX

        JLabel l1 = new JLabel("Enter Radius:");
        l1.setBounds(50, 50, 120, 30);
        getContentPane().add(l1);

        t1 = new JTextField();
        t1.setBounds(180, 50, 120, 30);
        getContentPane().add(t1);

        JLabel l2 = new JLabel("Area:");
        l2.setBounds(50, 100, 120, 30);
        getContentPane().add(l2);

        t2 = new JTextField();
        t2.setBounds(180, 100, 120, 30);
        getContentPane().add(t2);

        b1 = new JButton("Calculate");
        b1.setBounds(140, 150, 100, 30);
        getContentPane().add(b1);

        b1.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        double r = Double.parseDouble(t1.getText());
        double area = 3.14 * r * r;
        t2.setText("" + area);
    }

    public static void main(String[] args) {
        new AreaCircleSwing();
    }
}
