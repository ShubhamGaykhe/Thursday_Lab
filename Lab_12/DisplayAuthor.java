package Lab_12;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayAuthor extends BookManagement
{
	public void displayAuthorDetails()
	{
		try 
		{
			Connection conn=getConn();
			Statement stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from Author");
			
			System.out.print("\nA_Id\tName\tGmail\tPhone\n");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			conn.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
