package Lab_3;

import java.util.Scanner;

public class ShowRoom {
	String name;
	long mobno;
	double cost,discount;
	Scanner input=new Scanner(System.in);
	ShowRoom() // default constructor
	{
		name=" ";
		mobno=1234567890;
		cost=123.321;
		discount=123;
	}
	public void input() // accepting input
	{
		System.out.print("Enter customer name=");
		name=input.next();
		System.out.print("Enter customer mobile number=");
		mobno=input.nextLong();
		System.out.print("Enter item cost=");
		cost=input.nextDouble();
	}
	public void calculate() // calculating discount
	{
		if(cost<=10000)
		{
			System.out.println("Congratulation !!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("You have 5% discount");
			discount=cost*0.05;
		}
		else if(cost>10000 && cost<=20000)
		{
			System.out.println("Congratulation !!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("You have 10% discount");
			discount=cost*0.10;
		}
		else if(cost>20000 && cost<=35000)
		{
			System.out.println("Congratulation !!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("You have 15% discount");
			discount=cost*0.15;
		}
		else
		{
			System.out.println("Congratulation !!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("You have 20% discount");
			discount=cost*0.20;
		}
	}
	public void display()// printing bills
	{
		System.out.println("<<<<<<<< YOUR BILL >>>>>>>>>>");
		System.out.println("Name="+name);
		System.out.println("Mobile no="+mobno);
		System.out.println("Cost="+cost);
		System.out.println("Discount price="+discount);
		System.out.println("Paid price="+(cost-discount));
	}
	public static void main(String[] args) 
	{
		ShowRoom obj=new ShowRoom();
		// calling methods
		obj.input();
		obj.calculate();
		obj.display();
	}
}