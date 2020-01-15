import java.sql.*;
public class Forname {

	public static void main(String[] args) throws Exception
	{
		
		Class.forName("pqr");//this is to load a class without creating its object
		//Class.forName("pqr").newInstance(); // this will create the object of class pqr 
		                                    //and now instance block is also executes
		
		//that's why we use this to load the drivers
		//another method to load the drivers are:-
		//  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	}

}

class pqr
{
	static
	{
		System.out.println("static block");
	}
	
	//instance
	{
		System.out.println("instance block");
	}
}
