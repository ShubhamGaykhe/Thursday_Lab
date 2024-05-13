package Lab_3;
import java.util.Scanner;
interface BankAccount // interface
{
	void deposite();
	void withdraw();
}

class CheckingAccount implements BankAccount // implemented class
{
	double amount=0,deposite,withdraw;
	Scanner input=new Scanner(System.in);
	@Override
	public void deposite() // deposite method
	{
		System.out.print("Enter deposite amount=");
		amount=input.nextDouble();
		amount+=deposite;
		System.out.println("Amount deposite successfully");
	}

	@Override
	public void withdraw()  // withdraw method
	{
		System.out.print("Enter withdraw amount=");
		amount=input.nextDouble();
		if(amount==0 || deposite>amount)
			System.out.println("Your balance is not withdraw");
		else
			System.out.println("Amount withdraw successfully");
	}
}

class Vehical // parent class 
{
	String brand,model;
	int year;
	Scanner input=new Scanner(System.in);
	public void drive()
	{
		System.out.print("Enter brand=");
		brand=input.next();
		System.out.print("Enter model=");
		model=input.next();
		System.out.print("Enter year=");
		year=input.nextInt();
		
	}
}

class Car extends Vehical // child class of Vehical class
{
	String color;
	public void hunk()
	{
		System.out.print("Enter color=");
		color=input.next();
		
	}
	void display()
	{
		super.drive();
		hunk();
		System.out.println("Brand="+brand);
		System.out.println("Model="+model);
		System.out.println("Year="+year);
		System.out.println("Color="+color);
	}
}
public class Inherit_Interface 
{
	public static void main(String[] args) 
	{
		CheckingAccount obj=new CheckingAccount();
		obj.deposite();
		obj.withdraw();
		Car obj1=new Car();
		obj1.display();
	}
}
