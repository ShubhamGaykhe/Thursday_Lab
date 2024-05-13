package Lab_12;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ModifyBook extends BookManagement
{
	int count;
	public void modifyBookData()
	{
		Connection conn=getConn();
		String query;
		PreparedStatement ps;
		try
		{
			System.out.println("Modify data using Book ID\nWhich data you want to modify\n"
					+ "1) Book name\n"
					+ "2) Book quantity\n"
					+ "3) Book price\n"
					+ "Enter choice=");
			switch(input.nextInt()) {
				
			case 1:
				query="update Book set b_name=? where B_id=?";
				ps=conn.prepareStatement(query);
				
				System.out.print("Enter author id to change book name=");
				ps.setInt(2,input.nextInt());
				
				System.out.print("Enter new book name=");
				ps.setInt(1,input.nextInt());
				
				count=ps.executeUpdate();
				break;
			
			case 2:
				query="update Book set b_quantity=? where B_id=?";
				ps=conn.prepareStatement(query);
				
				System.out.print("Enter author id to change book quantity=");
				ps.setInt(2,input.nextInt());
				
				System.out.print("Enter new book quantity=");
				ps.setInt(1,input.nextInt());
				
				count=ps.executeUpdate();
				break;
				
			case 3:
				query="update Book set b_price=? where B_id=?";
				ps=conn.prepareStatement(query);
				
				System.out.print("Enter author id to change book price=");
				ps.setInt(2,input.nextInt());
				
				System.out.print("Enter new book price=");
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