package Lab_12;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ModifyAuthor extends BookManagement
{
	int count;
	public void modifyAuthorData()
	{
		Connection conn=getConn();
		String query;
		PreparedStatement ps;
		try
		{
		System.out.println("Modify data using Author ID\nWhich data you want to modify\n"
				+ "1) Author name\n"
				+ "2) Author gmial\n"
				+ "3) Author phone no\n"
				+ "Enter choice=");
		switch(input.nextInt()) {
		case 1:
			query="update Author set a_name=? where A_id=?";
			ps=conn.prepareStatement(query);
			
			System.out.print("Enter author id to change author name=");
			ps.setInt(1,input.nextInt());
			
			System.out.print("Enter new author name=");
			ps.setInt(0,input.nextInt());
			
			count=ps.executeUpdate();
			break;
			
		case 2:
			query="update Author set a_gmail=? where A_id=?";
			ps=conn.prepareStatement(query);
			
			System.out.print("Enter author id to change author gmail=");
			ps.setInt(2,input.nextInt());
			
			System.out.print("Enter new author gmail=");
			ps.setInt(1,input.nextInt());
			
			count=ps.executeUpdate();
			break;
			
		case 3:
			query="update Author set a_phone=? where A_id=?";
			ps=conn.prepareStatement(query);
			
			System.out.print("Enter author id to change author phone no.=");
			ps.setInt(2,input.nextInt());
			
			System.out.print("Enter new author phone no.=");
			ps.setInt(1,input.nextInt());
			
			count=ps.executeUpdate();
			break;
				
			default:
				System.out.println("Not valid choice");
		}
		if(count>0) 
			System.out.println("Data Modified");
		else
			System.out.println("Invalid ID\n First check the book List");
		conn.close();	
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
