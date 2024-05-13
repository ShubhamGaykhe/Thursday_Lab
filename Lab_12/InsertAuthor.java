package Lab_12;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class InsertAuthor extends BookManagement
{
	public void insertAuthorData()
	{
		String query="insert into Author values (?,?,?,?)";
		Connection conn=getConn();
		try 
		{
			PreparedStatement ps=conn.prepareStatement(query);
			
			System.out.print("Author ID=");
			ps.setInt(1,input.nextInt());
			
			System.out.print("Author name=");
			ps.setString(2,input.next());
			
			System.out.print("Author Gmail=");
			ps.setString(3,input.next());
			
			System.out.print("Author Phone no=");
			ps.setString(4,input.next());
			
			ps.execute();
			conn.close();
		} 
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
