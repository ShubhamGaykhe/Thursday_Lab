package Lab_8;

import java.util.*;

public class TajHotel 
{
	ArrayList<String> room=new ArrayList<>();
	
	int choice,room_type;
	double amount;
	char more_room;
	Scanner input=new Scanner(System.in);
	public void roomType()
	{
		do
		{
			System.out.print("\n---------------------- Available Rooms ----------------------\n"
					+ "1) Superior\n"
					+ "2) Deluxe\n"
					+ "3) Luxuary AC\n"
					+ "4) Luxuary Non AC\n"
					+ "5) Joint Room\n"
					+ "Which room you have=");
			choice=input.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("\n1) Single Room\t 2200Rs\n"
							+ "2) Double Room\t 2800Rs\n"
							+ "Enter=");
					room_type=input.nextInt();
					if(room_type==1)
					{
						room.add("Superior Single Room\t\t 2200Rs");
						amount+=2200;
					}
					else
					{
						room.add("Superior Double Room\t\t 2800Rs");
						amount+=2800;
					}
					break;
				case 2:
					System.out.print("\n1) Single Room\t 1500Rs\n"
							+ "2) Double Room\t 210Rs\n"
							+ "Enter=");
					room_type=input.nextInt();
					if(room_type==1)
					{
						room.add("Deluxe Single Room\t\t 1500Rs");
						amount+=1500;
					}				
					else
					{
						room.add("Deluxe Double Room\t\t 2100Rs");
						amount+=2100;
					}
					break;
					
				case 3:
					System.out.print("\n1) Single Room\t 2500Rs\n"
							+ "2) Double Room\t 3100Rs\n"
							+ "Enter=");
					room_type=input.nextInt();
					if(room_type==1)
					{
						room.add("Luxuary Ac Single Room\t\t 2500Rs");
						amount+=2500;
					}	
					else
					{
						room.add("Luxuary Ac Double Room\t\t 3100Rs");
						amount+=3100;
					}
					break;
					
				case 4:
					System.out.print("\n1) Single Room\t 2000Rs\n"
							+ "2) Double Room\t 2600Rs\n"
							+ "Enter=");
					room_type=input.nextInt();
					if(room_type==1)
					{
						room.add("Luxuary Non Ac Single Room\t\t 2000Rs");
						amount+=2000;
					}
					else
					{
						room.add("Luxuary Non Ac Double Room\t\t 2600Rs");
						amount+=2600;
					}
					break;
					
				case 5:
					System.out.print("\n1) Single Room\t 3000Rs\n"
							+ "2) Double Room\t 3600Rs\n"
							+ "Enter=");
					room_type=input.nextInt();
					if(room_type==1)
					{
						room.add("Joint Room Single Room\t\t 3000Rs");
						amount+=3000;
					}
					else
					{
						room.add("Joint Room Double Room\t\t 3000Rs");
						amount+=3600;
					}
					break;
					
					default:
						System.out.println("Enter valid room");
			}
			System.out.print("Do you have more room(Y/N):");
			more_room=input.next().charAt(0);
		}while(more_room=='y' || more_room=='Y');
	}
	
	public void bill()
	{
		Iterator<String> bill=room.iterator();
		System.out.println("-------------------------- BILL --------------------------");
		System.out.println("Room Names \t\t\t Amount");
		while(bill.hasNext())
		{
			System.out.println(bill.next());
		}
		System.out.println("----------------------------------------------");
		System.out.println("Total Bill amount\t\t "+amount);
	}
	public static void main(String[] args)
	{
		TajHotel obj=new TajHotel();
		obj.roomType();
		obj.bill();
	}
}
