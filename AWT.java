package AWT_application;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AWT  extends JFrame implements ActionListener{
	
	JFrame jf;
	JPanel pp;
	CardLayout cd;
	AWT()
	{
		jf=new JFrame("CardLayout Example");
		cd=new CardLayout();
		// creating a main parent panel that
		// will contain two child panel
		
		pp=new JPanel();
		
		//creating two child panels
		
		JPanel cp1=new JPanel();
		JPanel cp2=new JPanel();
		
		// Creating two parent buttons
		
		JButton b1=new JButton("Numbers");
		JButton b2=new JButton("Alphabets");
		
		// Creating three child buttons 
		// for numbers parent buttons
		
		JButton b3=new JButton("1");
		JButton b4=new JButton("2");
		JButton b5=new JButton("3");
		
		// Adding b3, b4 and b5 buttons to cp1
		
		cp1.add(b3);
		cp1.add(b4);
		cp1.add(b5);
		
		// Creating four child buttons 
		// for alphabets parent buttons
		
		JButton b6=new JButton("A");
		JButton b7=new JButton("B");
		JButton b8=new JButton("C");
		JButton b9=new JButton("D");
		
		// Adding b6, b7,b8 and b9 buttons to cp2
		
				cp2.add(b6);
				cp2.add(b7);
				cp2.add(b8);
				cp2.add(b9);
				
		// Setting the positioning of the components
	    // in pp(that contains cp1 & cp2) to CardLayout
				
		pp.setLayout(cd);
		
		// Adding cp1 and cp2 to pp
		
		pp.add(cp1,"Numbers");
		pp.add(cp2,"Alphabets");
		
		// Event generate
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		// Setting container JFrame's L
		// layout to FlowLayout 
		
		jf.setLayout(new FlowLayout());
		
		// Adding  two buttons to JFrame 
		// these button will remain commonly 
		// visible to all panels.
		
		jf.add(b1);
		jf.add(b2);
		
        // Adding parent panel pp to JFrame
		
		jf.add(pp);
		jf.setSize(400,300);
		jf.setVisible(true);
		
	}	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Numbers")
		{
			cd.show(pp,"Numbers");
		}
		else
		{
			cd.show(pp,"Alphabets");	
		}
	}


public static void main(String args[])
{
	new AWT();
}
}