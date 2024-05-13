package Lab_3;
import java.util.*;

class PrimeNumber // parent class of all class
{
	Scanner input=new Scanner(System.in);
	int num,i,j,flag,temp,lastDigit,reverse=0,count=0;
	double sum=0;
	public void prime() // method for calculating prime number
	{
		System.out.println("We are in prime class >>>>>>>>>>>>>>");
		System.out.print("Enter the number=");
		num=input.nextInt();
		flag=0;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;  
			}
		}
		if(flag==0) // print prime or not
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");
	}
}

class Palindrome extends PrimeNumber  // child class of PrimeNumber class
{
	public void palindrome()  // method for calculating palindrome number
	{
		super.prime();  //calling parent class method
		System.out.println("We are in palindrome class >>>>>>>>>>>>>>");
		System.out.println("Enter the number=");
		num=input.nextInt();
		temp=num;
		while(temp>0)
		{
			lastDigit=temp%10;
			reverse=lastDigit+(reverse*10); // reverse the given number
			temp/=10;
		}
		if(reverse==num)  // print number is palindrome or not
			System.out.println(num+" is palindrome number");
		else
			System.out.println(num+" is not palindrome number");
	}
}

class Armstrong extends Palindrome // child class of palindrome class
{
	public void armstrong() // method for calculating armstrong number
	{
		super.palindrome();  //calling parent class method
		System.out.println("We are in armstrong class >>>>>>>>>>>>>>");
		System.out.print("Enter number=");
		num=input.nextInt();
		temp=num;
		while(temp>0) // calculating digit in number
		{
			count++;
			temp/=10;
		}
		temp=num;
		while(temp>0)
		{
			lastDigit=temp%10;
			sum=sum+Math.pow(lastDigit,count);
			temp/=10;
		}
		if(sum==num) //  printing number is armstrong or not
			System.out.println(num+" is armstrong number");
		else
			System.out.println(num+" is not armstrong number");
	}
}
class Pattern extends Armstrong  // child class of armstrong class
{
	public void pattern() // printing pattern
	{
		super.armstrong(); //calling parent class method
		System.out.println("We are in pattern class >>>>>>>>>>>>>>");
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4-i;j++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(j);
			for(j=i-1;j>=1;j--)
				System.out.print(j);
			System.out.println();
		}
	}
}

public class Multilevel_Inheritance 
{
	public static void main(String[] args) 
	{
		Pattern obj=new Pattern(); // create object 
		obj.pattern(); // calling method
	}
}