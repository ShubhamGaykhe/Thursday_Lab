package Lab_6;
import java.util.Scanner;
// class for contry validation 
class CountryNotValidException extends Exception 
{
	CountryNotValidException(String message) 
	{
	    super(message);
	}
}
//class for name validation 
class EmployeeNameInvalidException extends Exception 
{
	EmployeeNameInvalidException(String message) 
	{
		super(message);
	}
}
//class for Eligible validation 
class TaxNotEligibleException extends Exception
{
	TaxNotEligibleException(String message) 
	{
		super(message);
	}
}
public class CalculatorSimulator
{
	double salary,taxAmount;
	boolean Isindian;
	String name;
	public void accept() // accept details
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter employee name");
		name=input.nextLine();

		System.out.println("Is this indian(true/false)=");
		Isindian=input.nextBoolean();

		System.out.println("Enter employee salary");
		salary=input.nextDouble();
	}
	
	public void calling()
	{
		try
		{
			taxAmount=TaxCalculator.calculateTax(name,Isindian,salary);
		}
		catch (CountryNotValidException e) 
	    {
	        System.out.println("Country not valid: " + e.getMessage());
	        e.printStackTrace();
	    } 
	    catch (EmployeeNameInvalidException e) 
	    {
	        System.out.println("Employee name not valid: " + e.getMessage());
	        e.printStackTrace();
	    } 
	    catch (TaxNotEligibleException e) 
		{
	        System.out.println("Not eligible for Tax calculation: " + e.getMessage());
	        e.printStackTrace();
	    }
		System.out.println("Employee tax amount="+taxAmount);
	}
	public static void main(String[] args) 
	{
		CalculatorSimulator obj=new CalculatorSimulator();
		obj.accept();
		obj.calling();
	}
}