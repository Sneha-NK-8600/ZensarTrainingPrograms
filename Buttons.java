package AWT_application;

import java.awt.*;
import javax.swing.*;

public class Buttons extends JFrame 
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	
	public Buttons()
	{
		setTitle("Simple Buttons");
        setSize(400, 200);
        
        b1.setBounds(100,50,100,30);
        
        b1=new JButton("Button1");
        add(b1);
       
	}
public static void main(String args[])
{
new Buttons();	
}
}