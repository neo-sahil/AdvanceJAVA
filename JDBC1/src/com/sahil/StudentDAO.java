package com.sahil;
import com.sahil.*;
import java.sql.*;
public class StudentDAO {
	
	Connection con = null;
	public void getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception occurs");
		}
	}

	public StudentDE getStudent(int idd)
	{
		String query = "select name from st.kittu where id="+idd;
		StudentDE s = new StudentDE();
		s.setId(idd);
		try 
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name= rs.getString(1);
			s.setUname(name);
			st.close();
			con.close();
		} 
		catch (Exception e) 
		{
			System.out.println("a exception occurs");
		}
		return s;
		
	}
	
	public void addStudent(StudentDE s)
	{
		String query = "insert into kittu(id, name)"
				+ "values"
				+ "(?,?)";
		try 
		{
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, s.getId());
			st.setString(2, s.getUname());
			st.executeUpdate();
			st.close();
			con.close();
			System.out.println("Data is inserted");
		} 
		catch (Exception e) 
		{
			System.out.println("a Exception occurs");
		}
	}
	
}
