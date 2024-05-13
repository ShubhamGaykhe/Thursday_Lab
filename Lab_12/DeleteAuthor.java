package Lab_12;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteAuthor extends BookManagement
{
	public void deleteAuthorDetails()
	{
		int book_id;
		int count;
		Connection conn=getConn();		
		
		String query="delete from Author where A_id=?";
		System.out.print("Enter book id for deletion=");
		book_id=input.nextInt();
		try 
		{		
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1,book_id);
			count=ps.executeUpdate();
			if(count>0) 
			{
				System.out.println("Author Deleted");
			}
			else
			{
				System.out.println("Invalid ID\n First check the Author List");
			}
			conn.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
//		input.close();
	}
}
