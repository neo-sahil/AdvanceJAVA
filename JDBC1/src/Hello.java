import java.sql.*;
public class Hello 
{

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/sahil"; //this is the url for mysql 
		String uname = "root";
		String password = "";
		String quary = "select * from personal";
		
		//load the driver
		Class.forName("com.mysql.jdbc.Driver"); //this is mysql driver
		
		//create the connection object
		Connection Con = DriverManager.getConnection(url, uname, password);
		
		//create statement object
		Statement stmt = Con.createStatement();	
		
		//execute quary
		ResultSet rs = stmt.executeQuery(quary);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		
		stmt.close();
		Con.close();
	}

}
