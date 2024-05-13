package Lab_9;
import java.util.Scanner;
public class ReplaceChar 
{
	Scanner input=new Scanner(System.in);
	String str;
	
	public void acceptString() // accept String
	{		
		System.out.print("Enter String=");
		str=input.next();
	}
	// replace first 4 character of  the string
	// using substring() methods
	public String replace()
	{
		String newStr="****";
		str=newStr+str.substring(4);
		return(str);
	}
	
	public static void main(String[] args) 
	{
		ReplaceChar obj=new ReplaceChar();
		obj.acceptString();
		System.out.println(obj.replace());
	}
}