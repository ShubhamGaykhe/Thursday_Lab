package Lab_12;

import java.sql.Connection; 
import java.sql.PreparedStatement;

public class InsertBook extends BookManagement
{
	
	public void insertBookData()
	{
		Connection conn=getConn();
		query="insert into Book values (?,?,?,?)";
		try 
		{			
			PreparedStatement ps=conn.prepareStatement(query);
			System.out.print("Book ID=");
			ps.setInt(1,input.nextInt());
			
			System.out.print("Book name=");
			ps.setString(2,input.next());
			
			System.out.print("Book quantity=");
			ps.setInt(3,input.nextInt());
			
			System.out.print("Book price=");
			ps.setDouble(4,input.nextDouble());
			
			ps.execute();
			conn.close();
		} 
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}