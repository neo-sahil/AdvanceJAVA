import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Insertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/sahil";
		String uname = "root";
		String password = "";
		String query = "insert into student(id, name, age, gender, phone)"
				+ "values"
				+ "(5, \"Yash sharma\", \"56\", \"M\", \"3801855244\")";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, password);
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		st.executeUpdate(query);
		

		st.close();
		con.close();
	}

}
