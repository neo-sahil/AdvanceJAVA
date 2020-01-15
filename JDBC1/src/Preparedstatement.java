import java.sql.*;
public class Preparedstatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/st";
		String uname = "root";
		String password = "";
		String username = "Kittu Sharma";
		int userid = 2;
		String query = "insert into kittu(id, name)"
				+ "values"
				+ "(?,?)";
				
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, password);
		PreparedStatement st = con.prepareStatement(query); //prepared statement is use to avoid 
	                                                       	//double codes problems in query string
		st.setInt(1, userid); //here 1 is the column number
		st.setString(2, username);//here 2 is the column number
		int n=st.executeUpdate();
		
		System.out.println(n+" row/s effected");
	}

}
