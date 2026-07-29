package AWT_application;

import java.awt.*;
import java.awt.event.*;


public class GUI2 extends Frame{
	GUI2()
	{
		Label l;
		this.addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		l=new Label("Window goes here");
		this.add(l);
		l.setForeground(Color.orange);
		l.setFont(new Font("Arial", Font.BOLD, 14));
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		new GUI2();
	}
}
