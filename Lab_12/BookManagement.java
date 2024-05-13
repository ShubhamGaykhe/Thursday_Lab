package Lab_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BookManagement 
{
	int Mainchoice,choice;
	
	Scanner input=new Scanner(System.in);
	String url="jdbc:mysql://localhost:3306/anudip";
	String username="root";
	String passwrd="root";
	String query;
	
	public Connection getConn() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,username ,passwrd );
		} catch (Exception e) {

			e.printStackTrace();
		}
		return conn;
	}
}
