package Lab_7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NotInteger {
	Scanner scanner = new Scanner(System.in);
	int num;
	public void accept()
	{
		 try
		 {
			 System.out.print("Enter an integer: ");
	         num = scanner.nextInt();
	         System.out.println("You entered:"+num);
		 }
		 catch (InputMismatchException e)
		 {
	        // Handle InputMismatchException
	         System.out.println("Error: Please enter a valid integer.");
		 }
		 
	}
    public static void main(String[] args) 
    {
    	NotInteger obj=new NotInteger();
    	obj.accept();
    }
}

