package JDBC_Application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;

public class StudentGUI extends JFrame implements ActionListener

{
	
    JLabel l1, l2, l3;
    JTextField tf1, tf2, tf3;
    JButton b1, b2, b3, b4;
    
   Connection con;
   Statement st;
   ResultSet rs;
 
   
    public StudentGUI()
    {
        // Frame settings
        setTitle("Simple Form");
        setSize(400, 200);
        setLayout(new FlowLayout());

        // Labels
        l1 = new JLabel("Enter Your Roll No :");
        l2 = new JLabel("Enter Your Name :");
        l3 = new JLabel("Enter Your Stipend :");

        // TextFields
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);

        // Buttons
        b1 = new JButton("FIRST");
        b2 = new JButton("NEXT");
        b3 = new JButton("PREVIOUS");
        b4 = new JButton("LAST");

        
        // Styling
        l1.setForeground(Color.GREEN);
        l1.setFont(new Font("Arial", Font.BOLD, 14));
        
        l2.setForeground(Color.blue);
        l2.setFont(new Font("Arial", Font.BOLD, 14));
        
        l3.setForeground(Color.orange);
        l3.setFont(new Font("Arial", Font.BOLD, 14));

        tf1.setFont(new Font("Arial", Font.BOLD, 12));
        tf2.setFont(new Font("Arial", Font.BOLD, 12));
        tf3.setFont(new Font("Arial", Font.BOLD, 12));


        b1.setForeground(Color.red);
        b2.setForeground(Color.black);
        b3.setForeground(Color.magenta);
        b4.setForeground(Color.blue);
        
       
        // Add components
        add(l1);
        add(tf1);

        add(l2);
        add(tf2);
        
        add(l3);
        add(tf3);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
          
        String url="jdbc:mysql://localhost:3306/NKOCET_TYA";
		String username="root";
		String password="Root";
		
		try {
			// Step 1: Load and register the drivers
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2 : Connect to database
			
			con=DriverManager.getConnection(url,username,password);
			
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			rs=st.executeQuery("SELECT * FROM Student_NKOCET ");
			
			
			//traverse 
			
			if(rs.next()) 
			{
				tf1.setText(rs.getString(1));
				tf2.setText(rs.getString(2));
				tf3.setText(rs.getString(3));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
		
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
public void actionPerformed(ActionEvent ae)
{
	try
	{
		JButton B=(JButton)ae.getSource();
		if(B==b1)
		{
			rs.first();
		}
		else if(B==b2)
		{
			if(!rs.isLast())
			{
				rs.next();
			}
		}
		else if(B==b3)
		{
			if(!rs.isFirst())
			{
				rs.previous();
			}
		}
		else if(B==b4)
		{
			rs.last();
		}
		
		//data fetch 
		
		tf1.setText(rs.getString(1));
		tf2.setText(rs.getString(2));
		tf3.setText(rs.getString(3));
	}
	catch (Exception e)
	{
		e.printStackTrace();	
	}
}
    public static void main(String[] args)
    {
        new StudentGUI();
    }
}


