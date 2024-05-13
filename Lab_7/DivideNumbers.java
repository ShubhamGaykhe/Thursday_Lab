package Lab_7;
import java.util.Scanner;

public class DivideNumbers 
{
	  Scanner input = new Scanner(System.in);
	int numerator,denominator;
	double result;
	public void inputData()
	{
		System.out.print("Enter the numerator number: ");
        numerator = input.nextInt();
        System.out.print("Enter the denominator number: ");
        denominator = input.nextInt();
	}
	public void Division()
	{
		 try 
		 {
            // Check if denominator is zero
            if (denominator == 0)
            {
                throw new ArithmeticException("Cannot divide by zero");
            }
            // Perform division and display the result 
            result = (double) numerator / denominator;
            System.out.println("Result: " + result);
	      } 
		 catch (ArithmeticException e)
		 {
		     System.out.println("Error: " + e.getMessage());
		 } 
		 catch (Exception e)
		 {
		     System.out.println("Error: Invalid input");
		 }
	}
    public static void main(String[] args) 
    {
    	DivideNumbers obj=new DivideNumbers();
    	obj.inputData();
    	obj.Division();       
    }
}
