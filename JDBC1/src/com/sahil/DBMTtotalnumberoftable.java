package com.sahil;
import java.sql.*;

public class DBMTtotalnumberoftable {

	public static void main(String[] args) {
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","");
			DatabaseMetaData dbmd = con.getMetaData();
			//String table[]= {"TABLE"};
			String table[]= {"VIEW"};
			ResultSet rs = dbmd.getTables(null,null,null,table);
			
			while(rs.next())
			{
				System.out.println(rs.getString(4));
			}
			con.close();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("there is a exception");
		}
		

	}

}
