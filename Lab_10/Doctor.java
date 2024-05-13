package Lab_10;
import java.util.*;
public class Doctor 
{
	ArrayList<Integer> Id=new ArrayList<>();
	ArrayList<String> Name=new ArrayList<>();
	ArrayList<String> Specility=new ArrayList<>();
	
	int id,i;
	
	Scanner input=new Scanner(System.in);
	
	public void choices()
	{
		do
		{
			System.out.print("******* Operations *******\n"
					+ "1) Add Doctor\n"
					+ "2) Display Doctors\n"
					+ "3) Update Doctor\n"
					+ "4) Exit\n"
					+ "Enter your choice=");
			switch(input.nextInt())
			{
				case 1:
					addDoctor();
					break;
					
				case 2:
					displayDoctor();
					break;
					
				case 3:
					updateDoctor();
					break;
					
				case 4:
					System.exit(0);
					break;
			}
		}while(true);
	}
	public void addDoctor()  //Add doctor details into arraylist
	{ 
		System.out.print("Enter Id=");
		Id.add(input.nextInt());
		
		System.out.print("Enter name=");
		Name.add(input.next());
		
		System.out.print("Enter specility=");
		Specility.add(input.next());
	}
	
	public void displayDoctor() // Display Doctor details
	{
		Iterator<Integer> id=Id.iterator();
		Iterator<String> name=Name.iterator();
		Iterator<String> specility=Specility.iterator();
		
		while(id.hasNext()&&name.hasNext()&&specility.hasNext())
		{
			System.out.println("\nId="+id.next()+"\nName="+name.next()+"\nSpecility="+specility.next());
		}
	}
	
	public void updateDoctor() // Update doctor details
	{
		System.out.println("Enter id for Update data=");
		id=input.nextInt();
		for(i=0;i<Id.size();i++)
		{
			if(id==Id.get(i)) 
			{
				System.out.print("Enter new Id=");
				Id.set(i, input.nextInt());
				
				System.out.print("Enter new Name=");
				Name.set(i, input.next());
				
				System.out.print("Enter new Specility=");
				Specility.set(i, input.next());
			}
		}
	}
	public static void main(String[] args) 
	{
		Doctor obj=new Doctor();
		obj.choices();
	}
}