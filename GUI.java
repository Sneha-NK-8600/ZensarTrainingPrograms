package AWT_application;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class GUI extends Frame
{
	GUI()
	{
		this.addWindowListener(new WindowAdapter()
	{
	public void WindowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	});
	
	
	
	Button btn=new Button("Click");
	btn.setBounds(30,100,100,30);
	btn.setBackground(Color.pink);
	btn.setFont(new Font("Arial", Font.BOLD, 14));
	btn.setForeground(Color.RED);    
	add(btn);
	
	setSize(300,300);
	setVisible(true);
	setLayout(null);
	
	
	
	}
	
public static void main(String args[]) 
{
	new GUI();
}
}
