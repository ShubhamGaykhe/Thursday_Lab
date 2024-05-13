package Lab_12;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayBook extends BookManagement
{
	public void displayBookDetails()
	{
		try 
		{
			Connection conn=getConn();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Book");
		
			System.out.print("\nB_Id\tName\t\tQuantity\tPrice\n");
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getDouble(4));
			conn.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
