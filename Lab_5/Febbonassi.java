package Lab_5;
import java.util.Scanner;
public class Febbonassi extends Thread
{
	
	public void menu()
	{
		Scanner input=new Scanner(System.in);
		int choice;
		// display menu and accept choice
		System.out.print("---->>>>> MENU <<<<<----\n"
				+ "1) Thread\n"
				+ "2) Febonassi series\n"
				+ "3) 1 to 9999 in reverse order\n"
				+ "Enter your choice=");
		choice=input.nextInt();
		switch(choice)
		{
			case 1:
				Febbonassi obj=new Febbonassi();
				obj.start();
				break;
				
			case 2:
				serrie();
				break;
				
			case 3:
				reverse();
				break;
		}
	}
	public void run() // run build in method of thread class
	{
		int i;
		String name="Threads";
		for(i=1;i<15;i++)
			System.out.println(name);
	}
	public void serrie()
	{
		int first=0,second=1,next,i;
		System.out.println("Febonassi Series");
		System.out.println(first);
		System.out.println(second);
		for(i=3;i<=20;i++)
		{
			next=first+second;
			first=second;
			second=next;
			System.out.println(next);
		}
	}
	
	public void reverse()
	{
		int i;
		System.out.println("1 to 9999 in reverse order");
		for(i=9999;i>0;i--)
			System.out.println(i);
	}
	public static void main(String[] args) 
	{
		Febbonassi obj1=new Febbonassi();
		obj1.menu();
	}
}