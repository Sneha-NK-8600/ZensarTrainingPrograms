package JDBC_Application;

import java.sql.*;

	public class JDBC {

		public static void main(String[] args) throws SQLException 
		{
			String url="jdbc:mysql://localhost:3306/NKOCET_TYA";
			String user="root";
			String password="Root";
			String dbName="NKOCET_TYA";
			
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//connect database
				
				Connection con=DriverManager.getConnection(url,user,password);
				System.out.println("Database Connection Succesfull !!");
				
				//create statement
				
				Statement stmt=con.createStatement();
				String sqlquery="CREATE DATABASE "+dbName;
				
				//execute statement
				
				stmt.executeUpdate(sqlquery);
				
				//we got result
				
				System.out.println("Database Created Succesfully !");
				
				//close connection
				con.close();
				
			} 
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

