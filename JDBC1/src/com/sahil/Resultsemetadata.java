package com.sahil;
import java.sql.*;
public class Resultsemetadata {

	public static void main(String[] args) {
		
		String query = "select * from emp";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","");
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Number of coloumns -> "+rsmd.getColumnCount());
			System.out.println("Name of coloumn at index 1 is -> "+rsmd.getColumnName(1));
			System.out.println("Type of the column at index 1 is -> "+rsmd.getColumnTypeName(1));
			System.out.println("Name of the table is -> "+rsmd.getTableName(2));
			pst.close();
			con.close();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("there is error in class.forname");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("there is a error in connection ");
		}

	}

}
