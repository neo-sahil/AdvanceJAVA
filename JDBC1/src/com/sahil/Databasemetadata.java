package com.sahil;
import java.sql.*;
public class Databasemetadata {

	public static void main(String[] args) {
		
		String query = "";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","");
			
			DatabaseMetaData dbmd = con.getMetaData();
			
			System.out.println("Driver name is -> "+dbmd.getDriverName());
			System.out.println("Driver version is -> "+dbmd.getDriverVersion());
			System.out.println("User name is -> "+dbmd.getUserName());
			System.out.println("Database product name is -> "+dbmd.getDatabaseProductName());
			System.out.println("Database product version is -> "+dbmd.getDatabaseProductVersion());
			con.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("there is a exception");
		}
	}

}
