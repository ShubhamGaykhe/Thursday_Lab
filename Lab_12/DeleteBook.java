package Lab_12;

import java.sql.Connection; 
import java.sql.PreparedStatement;

public class DeleteBook extends BookManagement
{
	public void deleteBookDetails()
	{
		int book_id;
		int count;
		Connection conn=getConn();
		
		String query="delete from Book where book_id=?";
		
		System.out.print("Enter book id for deletion=");
		book_id=input.nextInt();
		try 
		{	
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1,book_id);
			count=ps.executeUpdate();
			if(count>0) 
			{
				System.out.println("Book Deleted");
			}
			else
			{
				System.out.println("Invalid ID\n First check the Book List");
			}
			conn.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
