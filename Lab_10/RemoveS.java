package Lab_10;

import java.util.*;
import java.util.stream.Collectors;
public class RemoveS 
{
	List<String> names = new ArrayList<>();
	Scanner input=new Scanner(System.in);
	
	int num,i;
	public void accept()
	{
		// accept n names from user
		System.out.println("How many student you have=");
		num=input.nextInt();
		for(i=0;i<num;i++)
		{
			System.out.print("Enter name=");
			names.add(input.next());
		}
	}
	
	public void Display()
	{
		 System.out.println("Original list of student names: " + names);

         // Remove names starting with 'S' using lambda expression
         List<String> filteredNames = names.stream()
                 .filter(name -> !name.startsWith("S"))
                 .collect(Collectors.toList());

         // Print the updated list
         System.out.println("List after removing names starting with 'S': " + filteredNames);
	}
    public static void main(String[] args)
    {
    	RemoveS obj=new RemoveS();
    	obj.accept();
    	obj.Display();
    }
}