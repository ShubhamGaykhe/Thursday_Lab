package Lab_3;

import java.util.Scanner;

public class Calculator 
{
	double num1,num2,result;
	char operator,choice;
	Scanner input=new Scanner(System.in);
	public void Operatio()
	{
		do
		{
			System.out.print("Enter first number=");
			num1=input.nextDouble();
			System.out.print("Enter second number="); // accepting number
			num2=input.nextDouble();
			System.out.print(">>>>> Select operator\n"
					+ "+\n"
					+ "-\n"
					+ "*\n"
					+ "/\n");
			operator=input.next().charAt(0); // select operator
			switch(operator)
			{
				case '+':
					result=num1+num2;
					System.out.println("The addition="+result);
					break;
					
				case '-':
					result=num1-num2;
					System.out.println("The substraction="+result);
					break;
					
				case '*':
					result=num1*num2;
					System.out.println("The multiplication="+result);
					break;
					
				case '/':
					result=num1/num2;
					System.out.println("The division="+result);
					break;
					
				default:
					System.out.println("Enter valid choice");
			}
			System.out.println("Have more calculation(y/n)");
			choice=input.next().charAt(0);
		}while(choice=='Y'||choice=='y'); // while condition 
	}
	public static void main(String[] args) 
	{
		Calculator obj=new Calculator();
		obj.Operatio(); // call method
	}

}
