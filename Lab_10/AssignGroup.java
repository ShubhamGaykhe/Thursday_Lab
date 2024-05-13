package Lab_10;

import java.util.LinkedList;
import java.util.Scanner;

public class AssignGroup 
{
	int rollNumber,num,i,remainder;
	Scanner input=new Scanner(System.in);
	
	LinkedList<Integer> Sapphire=new LinkedList<>();
	LinkedList<Integer> Perl=new LinkedList<>();
	LinkedList<Integer> Ruby=new LinkedList<>();
	LinkedList<Integer> Emerald=new LinkedList<>();
	public void determineGroup() 
	{
		System.out.print("How many student you have=");
		num=input.nextInt();
		
		for(i=1;i<=num;i++)
		{
			// Calculate the remainder when divided by 4 to determine the group
			remainder=i%4;
			// Assign the group based on the remainder
	       if(remainder==0)
	    	   Emerald.add(i);
	       else if(remainder==1)
	           	Sapphire.add(i);
	       else if(remainder==2)
	            Perl.add(i);
	       else if(remainder==3)
	            Ruby.add(i);
		}
		// Display the group
		System.out.println("Sapphire:"+Sapphire);
		System.out.println("Perl:"+Perl);
		System.out.println("Ruby:"+Ruby);
		System.out.println("Emerald:"+Emerald);
    }
    public static void main(String[] args) 
    {
    	AssignGroup obj=new AssignGroup();
    	obj.determineGroup();
    }
  }