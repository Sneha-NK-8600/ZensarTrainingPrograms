package AWT_application;

import java.awt.*;
import javax.swing.*;

public class GUI3 extends JFrame
{
    JLabel l1, l2;
    JTextField tf1, tf2;
    JButton b1, b2, b3;

    public GUI3()
    {
        // Frame settings
        setTitle("Simple Form");
        setSize(300, 300);
        setLayout(new FlowLayout());

        // Labels
        l1 = new JLabel("Enter Your Name :");
        l2 = new JLabel("Enter Your Department :");

        // TextFields
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);

        // Buttons
        b1 = new JButton("SUBMIT");
        b2 = new JButton("CANCEL");
        b3 = new JButton("EXIT");

        // Styling
        l1.setForeground(Color.GREEN);
        l1.setFont(new Font("Arial", Font.BOLD, 14));
        
        l2.setForeground(Color.orange);
        l2.setFont(new Font("Arial", Font.BOLD, 14));

        tf1.setFont(new Font("Arial", Font.BOLD, 12));
        tf2.setFont(new Font("Arial", Font.BOLD, 12));


        b1.setForeground(Color.red);
        b2.setForeground(Color.black);
        b3.setForeground(Color.magenta);

        // Add components
        add(l1);
        add(tf1);

        add(l2);
        add(tf2);

        add(b1);
        add(b2);
        add(b3);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new GUI3();
    }
}
