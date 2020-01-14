import java.sql.*;
public class Result {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/sahil";
		String uname = "root";
		String password = "";
		String query = "select * from student";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, password);
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery(query);
		
		//getting the 3rd value
		rs.absolute(3);
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
		st.close();
		con.close();
	}

}
