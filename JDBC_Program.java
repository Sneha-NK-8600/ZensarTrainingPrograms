package JDBC_Application;

import java.sql.*;

public class JDBC_Program
{
	public static void main(String args[])
	{
		
		Connection con;
		Statement stmt;
		ResultSet rs;
		PreparedStatement pst;
		
		try {
			
        
		
		String url="jdbc:mysql://localhost:3306/NKOCET_TYA";
		String username="root";
		String password="Root";
		
		String query = "CREATE TABLE IF NOT EXISTS Student_NKOCET ("
		        + "RollNo INT PRIMARY KEY,"
		        + "Name VARCHAR(30),"
		        + "Stipend DOUBLE)";
		
		// Step 1: Load and register the drivers
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Step 2 : Connect to database
		
		con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection Successful...!!!");
		
		// Step 3: Create statement 
		
		stmt=con.createStatement();
		
		// Step 4:Execute update
		
		stmt.executeUpdate(query);
		System.out.println("Table Created Successfully...!!!");
	
		// Step 5: Insert the data into the table
		String insertQuery ="INSERT INTO Student_NKOCET" // table name is Student_NKOCET
				+ " (RollNo,Name,Stipend)"
				+ " VALUES (?,?,?)";
		
		 pst=con.prepareStatement(insertQuery);
		
		// Insert 1st Student record
		
		pst.setInt(1,101);
		pst.setString(2,"Sneha");
		pst.setDouble(3,457343.64);
		pst.executeUpdate();
		
		
		// Insert 2nd Student record
		
		pst.setInt(1,102);
		pst.setString(2,"Neha");
	    pst.setDouble(3,75485.64);
	    pst.executeUpdate();
	    
	   // Insert 3rd Student record
		
	    pst.setInt(1,103);
	    pst.setString(2,"Kavya");
	 	pst.setDouble(3,69868.85);
	 	pst.executeUpdate();
	 	
        // Insert 4th Student record
		
	    pst.setInt(1,104);
	    pst.setString(2,"John");
	 	pst.setDouble(3,867956.59);
	 	pst.executeUpdate();
	 	
        // Insert 5th Student record
		
	    pst.setInt(1,105);
	    pst.setString(2,"Jack");
	 	pst.setDouble(3,54859.89);
	 	pst.executeUpdate(); 	 
	 	
	   // Insert 5th Student record
	 	
	 	pst.setInt(1,106);
	    pst.setString(2,"Angelina");
	 	pst.setDouble(3,58468.89);
	 	pst.executeUpdate(); 	  
	 	
	 	System.out.println("Data Inserted Successfully...!!!");
	    
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
  }
}
