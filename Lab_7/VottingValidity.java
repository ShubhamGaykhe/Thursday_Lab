package Lab_7;

import java.util.Scanner;

public class VottingValidity
{
	Scanner input=new Scanner(System.in);
	int age;
	public void validation()
	{
		System.out.println("Enter age:");
		age=input.nextInt();
		try
		{
			if(age<18)
			{
				throw new Exception();
			}
			else
			{
				System.out.println("Age is valid");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error:Age is not valid");
		}
	}
	public static void main(String[] args)
	{
		VottingValidity obj=new VottingValidity();
		obj.validation();
	}

}
